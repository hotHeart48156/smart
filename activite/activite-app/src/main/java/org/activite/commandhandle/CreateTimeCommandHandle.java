package org.activite.commandhandle;

import lombok.Value;

@Value
public class CreateTimeCommandHandle {
    @CommandHandler
    public void on(CreateTimeCommand Command) {
        AggregateLifecycle.apply(new CreateTimeEvent(Command.getCreateTimeDto()));
    }
}
