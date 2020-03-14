package org.product.commandhandle;

import lombok.Value;

@Value
public class BrandNameCommandHandle {
    @CommandHandler
    public void on(BrandNameCommand Command) {
        AggregateLifecycle.apply(new BrandNameEvent(Command.getBrandNameDto()));
    }
}
