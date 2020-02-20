package org.order.kafka.src.main.java.com.smart.website.message.kafka.configuration.product.conf;

import org.springframework.context.annotation.Bean;

import java.util.Map;

/**
 * @author "yangbiao"
 * @create 2019121811:13
 */
@org.springframework.context.annotation.Configuration
public interface Configuration {
    @Bean
    Map<String, Object> producderConfigs();
}
