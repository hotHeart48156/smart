package com.smart.website.message.kafka.configuration.consume.container;

import com.smart.website.security.shiro.message.kakfa.consume.container.properties.ContainProperties;
import com.smart.website.security.shiro.message.kakfa.consume.factory.ConsumeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.listener.KafkaMessageListenerContainer;

/**
 * @author "yangbiao"
 * @create 2019121922:49
 */
public class ReplyContainer implements Container {
    @Autowired
    @Qualifier("ConsumeFactoryDev")
    ConsumeFactory factory;
    @Autowired
    @Qualifier("KafkaContainProperties")
    ContainProperties properties;

    @Bean
    public KafkaMessageListenerContainer replyingContainer() {
        KafkaMessageListenerContainer container = new KafkaMessageListenerContainer(factory.consumerFactory(), properties.properties());
        return container;
    }


}
