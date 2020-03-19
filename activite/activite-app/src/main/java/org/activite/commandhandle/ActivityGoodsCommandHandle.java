package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.ActivityGoodsEvent;
import org.activite.executor.command.ActivityGoodsCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;


import org.springframework.stereotype.Component;
@Value
@Component
public class ActivityGoodsCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(ActivityGoodsCommand Command) {
        AggregateLifecycle.apply(new ActivityGoodsEvent(Command.getActivityGoodsDto()));
    }
}
