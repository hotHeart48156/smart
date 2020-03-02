package org.users;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author "yangbiao"
 */
public interface MyProcessor {
    String MESSAGE_INPUT = "user_aggregate_input";
    String MESSAGE_OUTPUT = "user_aggregate_output";

    @Input(MESSAGE_INPUT)
    SubscribableChannel aggregateInput();

    @Output(MESSAGE_OUTPUT)
    MessageChannel aggregationOutput();
}
