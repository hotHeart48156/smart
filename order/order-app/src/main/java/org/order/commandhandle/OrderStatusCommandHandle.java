package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.event.OrderStatusEvent;
import org.order.executor.command.aggre.OrderStatusCommand;

@Value
public class OrderStatusCommandHandle {
    @CommandHandler
    public void on(OrderStatusCommand Command) {
        AggregateLifecycle.apply(new OrderStatusEvent(Command.getOrderStatusDto()));
    }
}
