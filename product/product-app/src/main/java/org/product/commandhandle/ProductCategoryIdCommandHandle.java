package org.product.commandhandle;

import lombok.Value;

@Value
public class ProductCategoryIdCommandHandle {
    @CommandHandler
    public void on(ProductCategoryIdCommand Command) {
        AggregateLifecycle.apply(new ProductCategoryIdEvent(Command.getProductCategoryIdDto()));
    }
}
