package org.product.commandhandle;

import lombok.Value;

@Value
public class ProductPriceCommandHandle {
    @CommandHandler
    public void on(ProductPriceCommand Command) {
        AggregateLifecycle.apply(new ProductPriceEvent(Command.getProductPriceDto()));
    }
}
