package com.smart.website.demo.commons.design.test.mock.scan;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.scan;

import java.io.Serializable;

/**
 * @author shawnzhan.zxy
 * @date 2018/09/24
 */
public interface TypeFilter extends Serializable{
    public boolean match(Class clazz);
    public String getUid();

}
