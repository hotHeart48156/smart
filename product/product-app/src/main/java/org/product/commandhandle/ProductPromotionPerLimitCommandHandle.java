package org.product.commandhandle;

import lombok.Value;

@Value
public class ProductPromotionPerLimitCommandHandle {
    @CommandHandler
    public void on(ProductPromotionPerLimitCommand Command) {
        AggregateLifecycle.apply(new ProductPromotionPerLimitEvent(Command.getProductPromotionPerLimitDto()));
    }
}
