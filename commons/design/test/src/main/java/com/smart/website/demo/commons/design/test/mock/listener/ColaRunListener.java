package com.smart.website.demo.commons.design.test.mock.listener;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.listener;

import ${package}.mock.ColaMockito;
import ${package}.mock.model.ColaTestDescription;

/**
 * @author shawnzhan.zxy
 * @date 2019/01/09
 */
public class ColaRunListener {

    public void testRunStarted(ColaTestDescription description){
        ColaMockito.g().getContext().setColaTestMeta(description);
    }
}
