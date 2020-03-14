package org.product.commandhandle;

import lombok.Value;

@Value
public class ProductNameCommandHandle {
    @CommandHandler
    public void on(ProductNameCommand Command) {
        AggregateLifecycle.apply(new ProductNameEvent(Command.getProductNameDto()));
    }
}
