package com.smart.website.demo.commons.design.test.mock.annotation;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface ExcludeCompare {
    String[] fields() default {};
    Class[] mockedInterfaces() default  {};
    String[] mockedMethods() default {};
}
