package org.activite.commandhandle;

import lombok.Value;

@Value
public class PromotionLogCommandHandle {
    @CommandHandler
    public void on(PromotionLogCommand Command) {
        AggregateLifecycle.apply(new PromotionLogEvent(Command.getPromotionLogDto()));
    }
}
