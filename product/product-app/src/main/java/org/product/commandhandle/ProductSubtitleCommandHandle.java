package org.product.commandhandle;

import lombok.Value;

@Value
public class ProductSubtitleCommandHandle {
    @CommandHandler
    public void on(ProductSubtitleCommand Command) {
        AggregateLifecycle.apply(new ProductSubtitleEvent(Command.getProductSubtitleDto()));
    }
}
