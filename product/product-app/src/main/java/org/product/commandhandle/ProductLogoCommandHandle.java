package org.product.commandhandle;

import lombok.Value;

@Value
public class ProductLogoCommandHandle {
    @CommandHandler
    public void on(ProductLogoCommand Command) {
        AggregateLifecycle.apply(new ProductLogoEvent(Command.getProductLogoDto()));
    }
}
