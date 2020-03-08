package com.smart.website.security.spring.interceptor;


import com.smart.website.security.spring.manage.AccessDecisionManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import java.util.logging.Filter;
import java.util.logging.LogRecord;


/**
 * @author "yangbiao"
 * @date 2019122320:34
 */
public class FilterSecurityInterceptor extends AbstractSecurityInterceptor implements SecurityInterceptor, Filter {
    @Autowired
    FilterInvocationSecurityMetadataSource securityMetadataSource;
    @Autowired
    @Qualifier("AccountAccessDecisionManage")
    AccessDecisionManage accessDecisionManage;

    @Override
    public boolean isLoggable(LogRecord record) {
        return true;
    }

    @Override
    public Class<?> getSecureObjectClass() {
        return FilterInvocation.class;
    }

    @Override
    public SecurityMetadataSource obtainSecurityMetadataSource() {
        return securityMetadataSource;
    }
}
