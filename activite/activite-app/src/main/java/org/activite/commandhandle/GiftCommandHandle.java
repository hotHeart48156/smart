package org.activite.commandhandle;

import lombok.Value;

@Value
public class GiftCommandHandle {
    @CommandHandler
    public void on(GiftCommand Command) {
        AggregateLifecycle.apply(new GiftEvent(Command.getGiftDto()));
    }
}
