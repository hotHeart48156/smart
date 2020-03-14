package org.activite.commandhandle;

import lombok.Value;

@Value
public class PlatformCommandHandle {
    @CommandHandler
    public void on(PlatformCommand Command) {
        AggregateLifecycle.apply(new PlatformEvent(Command.getPlatformDto()));
    }
}
