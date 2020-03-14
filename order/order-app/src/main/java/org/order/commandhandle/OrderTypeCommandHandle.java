package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.event.OrderTypeEvent;
import org.order.executor.command.aggre.OrderTypeCommand;

@Value
public class OrderTypeCommandHandle {
    @CommandHandler
    public void on(OrderTypeCommand Command) {
        AggregateLifecycle.apply(new OrderTypeEvent(Command.getOrderTypeDto()));
    }
}
