package org.product.commandhandle;

import lombok.Value;

@Value
public class ProductPromotionEndTimeCommandHandle {
    @CommandHandler
    public void on(ProductPromotionEndTimeCommand Command) {
        AggregateLifecycle.apply(new ProductPromotionEndTimeEvent(Command.getProductPromotionEndTimeDto()));
    }
}
