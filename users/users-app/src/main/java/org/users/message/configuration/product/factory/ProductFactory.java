package org.users.message.configuration.product.factory;

import org.springframework.kafka.core.DefaultKafkaProducerFactory;

/**
 * @author "yangbiao"
 * @create 2019121811:02
 */
public interface ProductFactory {
    DefaultKafkaProducerFactory ProductFactory();
}