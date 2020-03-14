package org.users;

import lombok.extern.slf4j.Slf4j;
import org.axonframework.commandhandling.CommandMessage;
import org.axonframework.common.Registration;
import org.axonframework.messaging.MessageDispatchInterceptor;
import org.axonframework.messaging.MessageDispatchInterceptorSupport;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.BiFunction;

/**
 * @author "yangbiao"
 */
@Slf4j
@Component
public class CommandMessageDispatherInterceptor implements MessageDispatchInterceptor<CommandMessage<?>>, MessageDispatchInterceptorSupport<CommandMessage<?>> {


    @Override
    public BiFunction<Integer, CommandMessage<?>, CommandMessage<?>> handle(List<? extends CommandMessage<?>> list) {
        return (index, command) -> {

            log.info("Dispatching a command {}.", command);
            return command;
        };
    }

    @Override
    public Registration registerDispatchInterceptor(MessageDispatchInterceptor<? super CommandMessage<?>> messageDispatchInterceptor) {
        return null;
    }
}
