package org.order.commandhandle;

import lombok.Value;

@Value
public class DeliverySnCommandHandle {
    @CommandHandler
    public void on(DeliverySnCommand Command) {
        AggregateLifecycle.apply(new DeliverySnEvent(Command.getDeliverySnDto()));
    }
}
