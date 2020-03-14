package org.product.commandhandle;

import lombok.Value;

@Value
public class GiftAndProductRelationshipCommandHandle {
    @CommandHandler
    public void on(GiftAndProductRelationshipCommand Command) {
        AggregateLifecycle.apply(new GiftAndProductRelationshipEvent(Command.getGiftAndProductRelationshipDto()));
    }
}
