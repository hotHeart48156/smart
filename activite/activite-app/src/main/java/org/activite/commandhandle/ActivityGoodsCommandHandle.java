package org.activite.commandhandle;

import lombok.Value;

@Value
public class ActivityGoodsCommandHandle {
    @CommandHandler
    public void on(ActivityGoodsCommand Command) {
        AggregateLifecycle.apply(new ActivityGoodsEvent(Command.getActivityGoodsDto()));
    }
}
