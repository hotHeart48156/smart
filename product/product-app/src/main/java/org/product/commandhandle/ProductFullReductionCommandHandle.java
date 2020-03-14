package org.product.commandhandle;

import lombok.Value;

@Value
public class ProductFullReductionCommandHandle {
    @CommandHandler
    public void on(ProductFullReductionCommand Command) {
        AggregateLifecycle.apply(new ProductFullReductionEvent(Command.getProductFullReductionDto()));
    }
}
