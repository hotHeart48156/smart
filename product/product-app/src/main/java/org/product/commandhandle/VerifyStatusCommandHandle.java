package org.product.commandhandle;

import lombok.Value;

@Value
public class VerifyStatusCommandHandle {
    @CommandHandler
    public void on(VerifyStatusCommand Command) {
        AggregateLifecycle.apply(new VerifyStatusEvent(Command.getVerifyStatusDto()));
    }
}
