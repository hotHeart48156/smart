package org.order.commandhandle;

import lombok.Value;

@Value
public class OrderReceiverAddressCommandHandle {
    @CommandHandler
    public void on(OrderReceiverAddressCommand Command) {
        AggregateLifecycle.apply(new OrderReceiverAddressEvent(Command.getOrderReceiverAddressDto()));
    }
}
