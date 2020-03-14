package org.users;

import lombok.extern.slf4j.Slf4j;
import org.axonframework.commandhandling.CommandMessage;
import org.axonframework.messaging.InterceptorChain;
import org.axonframework.messaging.MessageHandlerInterceptor;
import org.axonframework.messaging.unitofwork.UnitOfWork;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author "yangbiao"
 */
@Slf4j
@Component
public class CommandHandleInterceptor implements MessageHandlerInterceptor<CommandMessage<?>> {

    @Override
    public Object handle(UnitOfWork<? extends CommandMessage<?>> unitOfWork, InterceptorChain interceptorChain) throws Exception {
        CommandMessage<?> command = unitOfWork.getMessage();
        String userId = Optional.ofNullable(command.getMetaData().get("userId"))
                .map(uId -> (String) uId)
                .orElseThrow(IllegalCommandException::new);
        if ("axonUser".equals(userId)) {
            return interceptorChain.proceed();
        }
        return null;
    }
}
