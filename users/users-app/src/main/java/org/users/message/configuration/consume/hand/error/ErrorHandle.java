package org.users.message.configuration.consume.hand.error;

import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;

/**
 * @author "yangbiao"
 * @create 2019121811:42
 */
public abstract class ErrorHandle implements KafkaListenerErrorHandler, com.smart.website.security.shiro.message.kakfa.consume.hand.ErrorHandle {
    @Override
    public Object handleError(Message<?> message, ListenerExecutionFailedException e) {
        return null;
    }
}
