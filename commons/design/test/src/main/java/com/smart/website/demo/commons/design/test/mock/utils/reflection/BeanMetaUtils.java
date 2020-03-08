package com.smart.website.demo.commons.design.test.mock.utils.reflection;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.utils.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author shawnzhan.zxy
 * @date 2019/03/12
 */
public class BeanMetaUtils {
    public static Method findMethod(Class clazz, Class<? extends Annotation> annotationType){
        Method[] ${parentArtifactId}Methods = clazz.getMethods();
        for (Method method : ${parentArtifactId}Methods){
            Annotation[] annotations = method.getAnnotations();
            for(Annotation item : annotations){
                if(item.annotationType().equals(annotationType)){
                    return method;
                }
            }
        }
        return null;
    }
}
