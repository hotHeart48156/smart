package com.smart.website.demo.commons.design.core.exception.framework;


import com.smart.website.account.common.ApplicationContextHelper;
import com.smart.website.account.exception.ExceptionHandlerI;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

/**
 * ExceptionHandlerFactory
 *
 * @author Frank Zhang
 * @date 2019-01-08 9:51 AM
 */
public class ExceptionHandlerFactory {

    public static ExceptionHandlerI getExceptionHandler() {
        try {
            return ApplicationContextHelper.getBean(ExceptionHandlerI.class);
        } catch (NoSuchBeanDefinitionException ex) {
            return DefaultExceptionHandler.singleton;
        }
    }

}
