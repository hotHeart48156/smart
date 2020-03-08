package com.smart.website.message.kafka.configuration.consume.container;

import com.smart.website.security.shiro.message.kakfa.consume.container.properties.ContainProperties;
import com.smart.website.security.shiro.message.kakfa.consume.factory.ConsumeFactory;
import com.smart.website.security.shiro.message.kakfa.consume.hand.batch.BatchErrorHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.listener.KafkaMessageListenerContainer;

/**
 * @author "yangbiao"
 * @create 2019121812:06
 */
public class KafkaContainer implements Container {
    @Autowired
    ConsumeFactory factory;
    @Autowired
    ContainProperties properties;
    @Autowired
    BatchErrorHandle handle;

    @Bean
    KafkaMessageListenerContainer listenerContainer() {
        KafkaMessageListenerContainer container = new KafkaMessageListenerContainer(factory.consumerFactory(), properties.properties());
        container.setBatchErrorHandler(handle);
        container.setClientIdSuffix("consume-");
        return container;
    }
}
