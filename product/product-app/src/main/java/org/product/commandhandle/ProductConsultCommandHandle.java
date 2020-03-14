package org.product.commandhandle;

import lombok.Value;

@Value
public class ProductConsultCommandHandle {
    @CommandHandler
    public void on(ProductConsultCommand Command) {
        AggregateLifecycle.apply(new ProductConsultEvent(Command.getProductConsultDto()));
    }
}
