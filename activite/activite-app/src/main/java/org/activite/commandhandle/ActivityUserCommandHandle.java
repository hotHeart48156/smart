package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.ActivityUserEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

@Value
public class ActivityUserCommandHandle {
    @CommandHandler
    public void on(ActivityUserCommand Command) {
        AggregateLifecycle.apply(new ActivityUserEvent(Command.getActivityUserDto()));
    }
}
