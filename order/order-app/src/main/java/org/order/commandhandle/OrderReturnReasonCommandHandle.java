package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.event.OrderReturnReasonEvent;
import org.order.executor.command.entity.OrderReturnReasonCommand;

@Value
public class OrderReturnReasonCommandHandle {
    @CommandHandler
    public void on(OrderReturnReasonCommand Command) {
        AggregateLifecycle.apply(new OrderReturnReasonEvent(Command.getOrderReturnReasonDto()));
    }
}
