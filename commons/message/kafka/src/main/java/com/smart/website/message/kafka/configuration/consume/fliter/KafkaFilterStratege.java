package com.smart.website.message.kafka.configuration.consume.fliter;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.context.annotation.Bean;

/**
 * @author "yangbiao"
 * @create 2019121811:49
 */

public abstract class KafkaFilterStratege implements Filter {
    @Override
    @Bean
    public boolean filter(ConsumerRecord consumerRecord) {
        return false;
    }
}
