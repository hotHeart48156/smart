package org.activite.commandhandle;

import lombok.Value;

@Value
public class SmallTypeCommandHandle {
    @CommandHandler
    public void on(SmallTypeCommand Command) {
        AggregateLifecycle.apply(new SmallTypeEvent(Command.getSmallTypeDto()));
    }
}
