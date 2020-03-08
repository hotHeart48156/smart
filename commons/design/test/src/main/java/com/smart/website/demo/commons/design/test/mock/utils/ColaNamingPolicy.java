package com.smart.website.demo.commons.design.test.mock.utils;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.utils;

import org.springframework.cglib.core.DefaultNamingPolicy;

public class ColaNamingPolicy extends DefaultNamingPolicy {
    
    public static final ColaNamingPolicy INSTANCE = new ColaNamingPolicy();
    
    @Override
    protected String getTag() {
        return Constants.COLAMOCK_PROXY_FLAG;
    }
}