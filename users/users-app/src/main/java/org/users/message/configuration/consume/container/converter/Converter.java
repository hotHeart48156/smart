package org.users.message.configuration.consume.container.converter;

import org.springframework.kafka.support.converter.MessageConverter;

/**
 * @author "yangbiao"
 * @create 2019121812:33
 */
public interface Converter {
    MessageConverter messageConverter();
}
