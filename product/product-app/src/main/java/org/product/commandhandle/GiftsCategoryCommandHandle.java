package org.product.commandhandle;

import lombok.Value;

@Value
public class GiftsCategoryCommandHandle {
    @CommandHandler
    public void on(GiftsCategoryCommand Command) {
        AggregateLifecycle.apply(new GiftsCategoryEvent(Command.getGiftsCategoryDto()));
    }
}
