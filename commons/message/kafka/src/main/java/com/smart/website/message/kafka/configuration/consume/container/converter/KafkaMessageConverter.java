package com.smart.website.message.kafka.configuration.consume.container.converter;

import org.springframework.kafka.support.converter.MessageConverter;
import org.springframework.kafka.support.converter.MessagingMessageConverter;

/**
 * @author "yangbiao"
 * @create 2019121812:33
 */
public class KafkaMessageConverter implements Converter {
    @Override
    public MessageConverter messageConverter() {
        MessageConverter converter = new MessagingMessageConverter();


        return converter;
    }

}
