package com.smart.website.message.kafka.configuration.product.factory;

import org.springframework.kafka.core.DefaultKafkaProducerFactory;

/**
 * @author "yangbiao"
 * @create 2019121811:02
 */
public interface ProductFactory {
    DefaultKafkaProducerFactory ProductFactory();
}
