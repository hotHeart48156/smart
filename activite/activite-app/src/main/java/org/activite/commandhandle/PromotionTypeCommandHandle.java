package org.activite.commandhandle;

import lombok.Value;

@Value
public class PromotionTypeCommandHandle {
    @CommandHandler
    public void on(PromotionTypeCommand Command) {
        AggregateLifecycle.apply(new PromotionTypeEvent(Command.getPromotionTypeDto()));
    }
}
