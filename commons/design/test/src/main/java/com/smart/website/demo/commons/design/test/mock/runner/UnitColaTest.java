package com.smart.website.demo.commons.design.test.mock.runner;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ${package}.mock.ColaMockito;
import ${package}.mock.annotation.ColaMockConfig;
import ${package}.mock.model.ColaTestDescription;
import ${package}.mock.model.MockServiceModel;
import ${package}.mock.model.ColaTestModel;
import ${package}.mock.persist.ServiceListStore;
import ${package}.mock.proxy.MockDataProxy;
import ${package}.mock.scan.FilterManager;
import ${package}.mock.utils.Constants;
import ${package}.mock.utils.MockHelper;
import ${package}.mock.utils.SpyHelper;

/**
 * @author shawnzhan.zxy
 * @date 2019/01/04
 */
public class UnitColaTest extends AbstractColaTest {

    public UnitColaTest(ColaMockito colaMockito) {
        super(colaMockito);
    }

    @Override
    protected void initTest(ColaTestDescription desc) {
        super.initTest(desc);
        Object testInstance = desc.getTestInstance();
        if(ColaMockito.g().getContext().getColaTestModelMap().get(testInstance.getClass()) == null){
            List<ColaTestModel> colaTestModelList = colaMockito.scanColaTest(testInstance.getClass().getPackage().getName());
            colaMockito.getContext().setColaTestModelList(colaTestModelList);
        }

        List<MockServiceModel> unitMonitorList = scanUnitMonitor(testInstance.getClass(), true);
        injectMocks(testInstance, unitMonitorList);
    }

    private void injectMocks(final Object testClassInstance, List<MockServiceModel> unitMonitorList) {
        Class<?> clazz = testClassInstance.getClass();
        SpyHelper spyHelper = new SpyHelper(clazz, testClassInstance);
        Set<Object> mocks = new HashSet<>();
        for(MockServiceModel model : unitMonitorList){
            mocks.add(model.getMock());
        }
        spyHelper.processInject4Test(mocks);
    }

    /**
     * 扫描unit 类型下的monitor
     * @param testClass
     * @param isMock
     */
    private List<MockServiceModel> scanUnitMonitor(Class<?> testClass, boolean isMock) {
        ColaMockConfig colaMockConfig = testClass.getAnnotation(ColaMockConfig.class);
        if(colaMockConfig == null){
            return new ArrayList<>();
        }

        List<MockServiceModel> unitMonitorList = new ArrayList<>();
        ServiceListStore serviceListStore = new ServiceListStore();
        List<String> serviceList = serviceListStore.load();
        FilterManager filterManager = new FilterManager();
        filterManager.addAll(colaMockito.getCurrentTestModel().getTypeFilters());
        for(String name : serviceList) {
            String[] meta = name.split(Constants.SERVICE_LIST_DELIMITER);
            Class clazz = null;
            try {
                clazz = Class.forName(meta[1]);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                continue;
            }

            if(!filterManager.match(clazz)) {
                continue;
            }
            //查找是否已存在
            MockServiceModel monitor = colaMockito.getContext().getMonitorMockByCls(clazz);
            if(monitor != null){
                unitMonitorList.add(monitor);
                continue;
            }
            Object o = null;
            Object mock = null;
            if(isMock){
                //用mockito兜底方式，代理没问题，但是执行的时候进不去；暂时注释掉,改成直接生成MockDataProxy
                //o = Mockito.mock(clazz);
                //mock = createMockFor(o.getClass(), new MockDataProxy(clazz, o));
                mock = MockHelper.createMockFor(clazz, new MockDataProxy(clazz, o));
            }
            monitor = new MockServiceModel(clazz, clazz.getName(), o, mock);
            colaMockito.getContext().putMonitorMock(monitor);
            unitMonitorList.add(monitor);
        }
        return unitMonitorList;
    }
}
