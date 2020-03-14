package org.product.commandhandle;

import lombok.Value;

@Value
public class ProductVerifyRecordCommandHandle {
    @CommandHandler
    public void on(ProductVerifyRecordCommand Command) {
        AggregateLifecycle.apply(new ProductVerifyRecordEvent(Command.getProductVerifyRecordDto()));
    }
}
