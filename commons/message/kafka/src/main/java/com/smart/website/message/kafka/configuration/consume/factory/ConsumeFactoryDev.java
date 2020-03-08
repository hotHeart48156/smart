package com.smart.website.message.kafka.configuration.consume.factory;

import com.smart.website.security.shiro.message.kakfa.consume.config.ConsumeConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

/**
 * @author "yangbiao"
 * @create 2019121810:39
 */
public class ConsumeFactoryDev implements ConsumeFactory {
    @Autowired
    ConsumeConfig consumerConfigs;

    @Override
    @Bean
    public ConsumerFactory<String, String> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs.consumerConfigs());
    }

}
