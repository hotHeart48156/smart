package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.event.OrderReturnApplyEvent;
import org.order.executor.command.entity.OrderReturnApplyCommand;

@Value
public class OrderReturnApplyCommandHandle {
    @CommandHandler
    public void on(OrderReturnApplyCommand Command) {
        AggregateLifecycle.apply(new OrderReturnApplyEvent(Command.getOrderReturnApplyDto()));
    }
}
