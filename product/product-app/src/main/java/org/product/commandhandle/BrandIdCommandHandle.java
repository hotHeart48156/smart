package org.product.commandhandle;

import lombok.Value;

@Value
public class BrandIdCommandHandle {
    @CommandHandler
    public void on(BrandIdCommand Command) {
        AggregateLifecycle.apply(new BrandIdEvent(Command.getBrandIdDto()));
    }
}
