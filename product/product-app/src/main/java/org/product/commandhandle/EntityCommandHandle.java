package org.product.commandhandle;

import lombok.Value;

@Value
public class EntityCommandHandle {
    @CommandHandler
    public void on(EntityCommand Command) {
        AggregateLifecycle.apply(new EntityEvent(Command.getEntityDto()));
    }
}
