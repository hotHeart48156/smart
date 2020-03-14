package org.product.commandhandle;

import lombok.Value;

@Value
public class GiftsCommandHandle {
    @CommandHandler
    public void on(GiftsCommand Command) {
        AggregateLifecycle.apply(new GiftsEvent(Command.getGiftsDto()));
    }
}
