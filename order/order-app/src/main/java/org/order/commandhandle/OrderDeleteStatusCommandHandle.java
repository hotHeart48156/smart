package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.event.OrderDeleteStatusEvent;
import org.order.executor.command.aggre.OrderDeleteStatusCommand;

@Value
public class OrderDeleteStatusCommandHandle {
    @CommandHandler
    public void on(OrderDeleteStatusCommand Command) {
        AggregateLifecycle.apply(new OrderDeleteStatusEvent(Command.getOrderDeleteStatusDto()));
    }
}
