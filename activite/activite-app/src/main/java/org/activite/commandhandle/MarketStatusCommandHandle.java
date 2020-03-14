package org.activite.commandhandle;

import lombok.Value;

@Value
public class MarketStatusCommandHandle {
    @CommandHandler
    public void on(MarketStatusCommand Command) {
        AggregateLifecycle.apply(new MarketStatusEvent(Command.getMarketStatusDto()));
    }
}
