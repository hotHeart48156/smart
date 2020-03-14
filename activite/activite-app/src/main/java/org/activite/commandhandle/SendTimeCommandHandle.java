package org.activite.commandhandle;

import lombok.Value;

@Value
public class SendTimeCommandHandle {
    @CommandHandler
    public void on(SendTimeCommand Command) {
        AggregateLifecycle.apply(new SendTimeEvent(Command.getSendTimeDto()));
    }
}
