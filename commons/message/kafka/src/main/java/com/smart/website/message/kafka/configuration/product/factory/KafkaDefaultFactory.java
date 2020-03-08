package com.smart.website.message.kafka.configuration.product.factory;

import com.smart.website.message.kafka.configuration.product.conf.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;


/**
 * @author "yangbiao"
 * @create 2019121811:02
 */
@org.springframework.context.annotation.Configuration
public class KafkaDefaultFactory implements ProductFactory {
    @Autowired
    private Configuration configuration;

    @Override
    public DefaultKafkaProducerFactory ProductFactory() {
        DefaultKafkaProducerFactory factory = new DefaultKafkaProducerFactory(configuration.producderConfigs());
        return factory;
    }
}

