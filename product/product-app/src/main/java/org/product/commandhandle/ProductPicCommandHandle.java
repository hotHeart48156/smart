package org.product.commandhandle;

import lombok.Value;

@Value
public class ProductPicCommandHandle {
    @CommandHandler
    public void on(ProductPicCommand Command) {
        AggregateLifecycle.apply(new ProductPicEvent(Command.getProductPicDto()));
    }
}
