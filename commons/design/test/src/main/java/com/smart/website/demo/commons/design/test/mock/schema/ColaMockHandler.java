package com.smart.website.demo.commons.design.test.mock.schema;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.schema;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author shawnzhan.zxy
 * @date 2018/10/11
 */
public class ColaMockHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("cola-mock", new ColaMockBeanDefinitionParser());
    }
}