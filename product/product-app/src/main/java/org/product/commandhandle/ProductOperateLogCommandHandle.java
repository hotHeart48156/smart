package org.product.commandhandle;

import lombok.Value;

@Value
public class ProductOperateLogCommandHandle {
    @CommandHandler
    public void on(ProductOperateLogCommand Command) {
        AggregateLifecycle.apply(new ProductOperateLogEvent(Command.getProductOperateLogDto()));
    }
}
