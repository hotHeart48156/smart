package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.ActivityGoodsEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

@Value
public class ActivityGoodsCommandHandle {
    @CommandHandler
    public void on(ActivityGoodsCommand Command) {
        AggregateLifecycle.apply(new ActivityGoodsEvent(Command.getActivityGoodsDto()));
    }
}
