package org.activite.commandhandle;

import lombok.Value;

@Value
public class ActivityUserCommandHandle {
    @CommandHandler
    public void on(ActivityUserCommand Command) {
        AggregateLifecycle.apply(new ActivityUserEvent(Command.getActivityUserDto()));
    }
}
