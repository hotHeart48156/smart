package com.smart.website.demo.commons.design.test.mock.agent.transformlet;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.agent.transformlet;

import ${package}.mock.agent.model.AgentArgs;
import ${package}.mock.agent.model.TranslateType;

import javassist.CtClass;
import javassist.CtMethod;

/**
 * @author shawnzhan.zxy
 * @date 2019/05/10
 */
public class OnlineRecordTransformlet extends AbstractTransformlet{

    public OnlineRecordTransformlet(String className) {
        super(className, TranslateType.ONLINE_RECORD);
    }

    @Override
    CtClass transform(String className, CtClass clazz, ClassLoader loader, AgentArgs config) throws Exception {
        CtMethod method = null;
        try {
            method = clazz.getDeclaredMethod(config.getMethodName());
        }catch(Exception e){
            method = clazz.getMethod(config.getMethodName(), "");
        }
        TransformletUtils.doArroundForMethod(clazz, method, berforeCode(method), afterCode(method));
        return clazz;
    }

    private String berforeCode(CtMethod method){
        StringBuilder sb = new StringBuilder();
        sb.append("${package}.mock.agent.proxy.OnlineRecordProxy proxy = ${package}.mock.agent.proxy.OnlineRecordProxy.get(this.getClass());");
        sb.append("proxy.buildParamterValues(${symbol_dollar}args);");
        sb.append("proxy.beforeMethod(this,${symbol_escape}""+method.getName()+"${symbol_escape}");");
        return sb.toString();
    }

    private String afterCode(CtMethod method){
        StringBuilder sb = new StringBuilder();
        sb.append("${package}.mock.agent.proxy.OnlineRecordProxy proxy = ${package}.mock.agent.proxy.OnlineRecordProxy.get(this.getClass());");
        sb.append("proxy.afterMethod(this,${symbol_escape}""+method.getName()+"${symbol_escape}");");
        sb.append("${package}.mock.agent.proxy.OnlineRecordProxy.remove();");
        return sb.toString();
    }
}
