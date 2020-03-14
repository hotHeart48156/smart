package org.activite.commandhandle;

import lombok.Value;

@Value
public class DiscountTypeCommandHandle {
    @CommandHandler
    public void on(DiscountTypeCommand Command) {
        AggregateLifecycle.apply(new DiscountTypeEvent(Command.getDiscountTypeDto()));
    }
}
