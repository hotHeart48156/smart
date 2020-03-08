package com.smart.website.demo.commons.design.test.mock.annotation;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

/**
 * @author shawnzhan.zxy
 * @date 2018/08/30
 */
@Target( { FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ColaMock {
}
