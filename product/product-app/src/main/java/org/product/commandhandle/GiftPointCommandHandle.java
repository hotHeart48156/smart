package org.product.commandhandle;

import lombok.Value;

@Value
public class GiftPointCommandHandle {
    @CommandHandler
    public void on(GiftPointCommand Command) {
        AggregateLifecycle.apply(new GiftPointEvent(Command.getGiftPointDto()));
    }
}
