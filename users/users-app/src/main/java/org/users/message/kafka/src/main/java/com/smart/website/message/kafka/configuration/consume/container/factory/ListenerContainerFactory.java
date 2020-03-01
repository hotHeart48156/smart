package org.users.message.kafka.src.main.java.com.smart.website.message.kafka.configuration.consume.container.factory;

import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;

/**
 * @author "yangbiao"
 * @create 2019121811:34
 */
public interface ListenerContainerFactory {
    ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory();

}
