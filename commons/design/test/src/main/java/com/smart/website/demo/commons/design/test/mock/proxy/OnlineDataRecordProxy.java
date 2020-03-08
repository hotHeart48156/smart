package com.smart.website.demo.commons.design.test.mock.proxy;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.proxy;

import java.lang.reflect.Method;
import java.util.ArrayList;

import ${package}.mock.ColaMockito;
import ${package}.mock.ColaRecordController;
import ${package}.mock.persist.DataStoreEnum;
import ${package}.mock.persist.FileDataEngine;

import org.springframework.cglib.proxy.MethodProxy;

/**
 * 解决多任务同时并发问题，同时不支持异步录制
 * @author shawnzhan.zxy
 * @date 2018/09/02
 */
public class OnlineDataRecordProxy extends DataRecordProxy{

    public OnlineDataRecordProxy(Class mapperInterface, Object instance) {
        super(mapperInterface, instance);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return invokeMethod(o, method, objects, methodProxy);
    }

    @Override
    protected void beforeMethod(Object o, Method method, Object[] objects, MethodProxy methodProxy){
        if(isTestFront()){
            ColaMockito colaMockito = initColaMockito();
            ColaRecordController.mainRecord.set(colaMockito);
            colaMockito.getFileDataEngine().clean();
        }
        super.beforeMethod(o, method, objects, methodProxy);
    }

    @Override
    public Object invokeMethod(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable{
        if(isTestFront()){
            try{
                return super.invokeMethod(o, method, objects, methodProxy);
            }fin${parentArtifactId}y {
                ColaRecordController.mainRecord.remove();
            }
        }else{
            return super.invokeMethod(o, method, objects, methodProxy);
        }
    }

    @Override
    protected Object afterMethod(Method method, Object[] params, Object result){
        result = super.afterMethod(method, params, result);
        if(isTestFront()){
            getColaMockito().getFileDataEngine().flushOutputData();
            getColaMockito().getFileDataEngine().flushInputParamsFile();
        }
        return result;
    }

    @Override
    protected ColaMockito getColaMockito(){
        return ColaRecordController.mainRecord.get();
    }

    @Override
    protected String getMockFileName(){
        return getColaMockito().getContext().getDescription().getClassName() + "Test_"
            + getColaMockito().getContext().getDescription().getMethodName();
    }
    /**
     * 通过全局ColaMockito.g() 来判断是否开启
     * @return
     */
    private boolean isTestFront() {
        return recordStarted()
            && ColaMockito.g().getCurrentTestModel().getTestClazz().isAssignableFrom(mapperInterface);
    }

    private ColaMockito initColaMockito() {
        ColaMockito colaMockito = new ColaMockito();
        try {
            colaMockito.getContext().setRecording(ColaMockito.g().getContext().isRecording());
            colaMockito.getContext().setColaTestModelList(
                new ArrayList<>(ColaMockito.g().getContext().getColaTestModelMap().values()));
            colaMockito.getContext().getColaTestMeta().setDescription(ColaMockito.g().getContext().getDescription());
            colaMockito.setFileDataEngine(new FileDataEngine(DataStoreEnum.JSON_STORE, ColaMockito.g().getFileDataEngine().getSrcResource()));
        } catch (Exception e) {
            throw new RuntimeException("", e);
        }
        return colaMockito;
    }

}
