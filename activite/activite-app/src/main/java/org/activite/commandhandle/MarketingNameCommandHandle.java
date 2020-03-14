package org.activite.commandhandle;

import lombok.Value;

@Value
public class MarketingNameCommandHandle {
    @CommandHandler
    public void on(MarketingNameCommand Command) {
        AggregateLifecycle.apply(new MarketingNameEvent(Command.getMarketingNameDto()));
    }
}
