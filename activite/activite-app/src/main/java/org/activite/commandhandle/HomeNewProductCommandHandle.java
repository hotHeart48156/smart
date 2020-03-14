package org.activite.commandhandle;

import lombok.Value;

@Value
public class HomeNewProductCommandHandle {
    @CommandHandler
    public void on(HomeNewProductCommand Command) {
        AggregateLifecycle.apply(new HomeNewProductEvent(Command.getHomeNewProductDto()));
    }
}
