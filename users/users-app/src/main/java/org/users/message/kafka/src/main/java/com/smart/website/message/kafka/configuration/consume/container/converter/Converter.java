package org.users.message.kafka.src.main.java.com.smart.website.message.kafka.configuration.consume.container.converter;

import org.springframework.kafka.support.converter.MessageConverter;

/**
 * @author "yangbiao"
 * @create 2019121812:33
 */
public interface Converter {
    MessageConverter messageConverter();
}
