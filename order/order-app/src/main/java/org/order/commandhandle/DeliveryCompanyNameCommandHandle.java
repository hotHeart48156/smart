package org.order.commandhandle;

import lombok.Value;

@Value
public class DeliveryCompanyNameCommandHandle {
    @CommandHandler
    public void on(DeliveryCompanyNameCommand Command) {
        AggregateLifecycle.apply(new DeliveryCompanyNameEvent(Command.getDeliveryCompanyNameDto()));
    }
}
