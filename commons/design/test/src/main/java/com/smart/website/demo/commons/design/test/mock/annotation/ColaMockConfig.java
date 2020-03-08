package com.smart.website.demo.commons.design.test.mock.annotation;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author shawnzhan.zxy
 * @date 2018/09/02
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public @interface ColaMockConfig {
    Class[] mocks() default {};
    String[] regexMocks() default {};
    Class[] annotationMocks() default {};
    Class[] dataManufactures() default {};
}
