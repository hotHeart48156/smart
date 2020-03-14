package org.product.commandhandle;

import lombok.Value;

@Value
public class GiftGrowthCommandHandle {
    @CommandHandler
    public void on(GiftGrowthCommand Command) {
        AggregateLifecycle.apply(new GiftGrowthEvent(Command.getGiftGrowthDto()));
    }
}
