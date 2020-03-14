package org.activite.commandhandle;

import lombok.Value;

@Value
public class StartTimeCommandHandle {
    @CommandHandler
    public void on(StartTimeCommand Command) {
        AggregateLifecycle.apply(new StartTimeEvent(Command.getStartTimeDto()));
    }
}
