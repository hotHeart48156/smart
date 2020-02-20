package com.geekhalo.ddd.lite.spring.soa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SoaServerConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(SoaServerConfiguration.class);

    @Configuration
    public static class SoaWebMvcConfigurer implements WebMvcConfigurer {
        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            LOGGER.warn("add {} Interceptor", "HandlerInterceptorBasedExceptionBinder");
            registry.addInterceptor(new HandlerInterceptorBasedExceptionBinder()).addPathPatterns("/**");
        }
    }

}
