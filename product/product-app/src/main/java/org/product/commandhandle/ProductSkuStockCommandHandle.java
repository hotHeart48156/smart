package org.product.commandhandle;

import lombok.Value;

@Value
public class ProductSkuStockCommandHandle {
    @CommandHandler
    public void on(ProductSkuStockCommand Command) {
        AggregateLifecycle.apply(new ProductSkuStockEvent(Command.getProductSkuStockDto()));
    }
}
