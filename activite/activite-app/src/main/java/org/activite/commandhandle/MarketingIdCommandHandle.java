package org.activite.commandhandle;

import lombok.Value;

@Value
public class MarketingIdCommandHandle {
    @CommandHandler
    public void on(MarketingIdCommand Command) {
        AggregateLifecycle.apply(new MarketingIdEvent(Command.getMarketingIdDto()));
    }
}
