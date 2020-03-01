package org.users.message.kafka.src.main.java.com.smart.website.message.kafka.configuration.consume.factory;

import org.springframework.kafka.core.ConsumerFactory;

/**
 * @author "yangbiao"
 * @create 2019121810:38
 */
public interface ConsumeFactory {
    ConsumerFactory<String, String> consumerFactory();
}
