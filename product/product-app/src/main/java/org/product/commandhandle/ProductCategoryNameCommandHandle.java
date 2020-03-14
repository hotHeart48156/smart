package org.product.commandhandle;

import lombok.Value;

@Value
public class ProductCategoryNameCommandHandle {
    @CommandHandler
    public void on(ProductCategoryNameCommand Command) {
        AggregateLifecycle.apply(new ProductCategoryNameEvent(Command.getProductCategoryNameDto()));
    }
}
