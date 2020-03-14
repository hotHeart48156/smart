package org.order.commandhandle;

import lombok.Value;

@Value
public class OrderItemCommandHandle {
    @CommandHandler
    public void on(OrderItemCommand Command) {
        AggregateLifecycle.apply(new OrderItemEvent(Command.getOrderItemDto()));
    }
}
