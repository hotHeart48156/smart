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
public class DataRecordTransformlet extends AbstractTransformlet {
    public DataRecordTransformlet(String className, TranslateType type){
        super(className, type);
    }

    @Override
    public CtClass transform(String className, CtClass clazz, ClassLoader loader, AgentArgs config)
        throws Exception {
        return clazz;
    }
}
