package com.smart.website.security.spring.handle.error;

import org.springframework.security.web.access.AccessDeniedHandler;

/**
 * @author "yangbiao"
 * @create 2019122322:20
 */
public interface AccessDenied {
    AccessDeniedHandler deniedHandler();
}
