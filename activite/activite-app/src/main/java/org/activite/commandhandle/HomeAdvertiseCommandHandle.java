package org.activite.commandhandle;

import lombok.Value;

@Value
public class HomeAdvertiseCommandHandle {
    @CommandHandler
    public void on(HomeAdvertiseCommand Command) {
        AggregateLifecycle.apply(new HomeAdvertiseEvent(Command.getHomeAdvertiseDto()));
    }
}
