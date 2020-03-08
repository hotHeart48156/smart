package com.smart.website.demo.commons.design.test.mock.agent.transformlet;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.agent.transformlet;

import ${package}.mock.agent.model.AgentArgs;
import ${package}.mock.agent.model.TranslateType;

import javassist.CtClass;

/**
 * @author shawnzhan.zxy
 * @date 2018/11/12
 */
public abstract class AbstractTransformlet {
    private String className;
    private TranslateType type;

    public AbstractTransformlet(String className, TranslateType type){
        this.className = className;
        this.type = type;
    }

    abstract CtClass transform(String className, CtClass clazz, ClassLoader loader, AgentArgs config) throws Exception;

    public CtClass doTransform(String className, CtClass clazz, ClassLoader loader, AgentArgs config) throws Exception{
        if(!this.className.equals(className)){
            return clazz;
        }

        if(TransformletUtils.existsFlagField(clazz, config)){
            return clazz;
        }
        transform(className, clazz, loader, config);
        //TransformletUtils.injectFlagField(clazz, config);
        return clazz;
    }


}
