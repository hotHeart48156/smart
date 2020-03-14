package org.activite.commandhandle;

import lombok.Value;

@Value
public class EndTimeCommandHandle {
    @CommandHandler
    public void on(EndTimeCommand Command) {
        AggregateLifecycle.apply(new EndTimeEvent(Command.getEndTimeDto()));
    }
}
