package org.product.commandhandle;

import lombok.Value;

@Value
public class IdCommandHandle {
    @CommandHandler
    public void on(IdCommand Command) {
        AggregateLifecycle.apply(new IdEvent(Command.getIdDto()));
    }
}
