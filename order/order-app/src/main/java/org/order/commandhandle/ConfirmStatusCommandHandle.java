package org.order.commandhandle;

import lombok.Value;

@Value
public class ConfirmStatusCommandHandle {
    @CommandHandler
    public void on(ConfirmStatusCommand Command) {
        AggregateLifecycle.apply(new ConfirmStatusEvent(Command.getConfirmStatusDto()));
    }
}
