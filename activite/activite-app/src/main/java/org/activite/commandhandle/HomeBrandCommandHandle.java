package org.activite.commandhandle;

import lombok.Value;

@Value
public class HomeBrandCommandHandle {
    @CommandHandler
    public void on(HomeBrandCommand Command) {
        AggregateLifecycle.apply(new HomeBrandEvent(Command.getHomeBrandDto()));
    }
}
