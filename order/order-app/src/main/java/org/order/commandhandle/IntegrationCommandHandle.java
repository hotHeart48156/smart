package org.order.commandhandle;

import lombok.Value;

@Value
public class IntegrationCommandHandle {
    @CommandHandler
    public void on(IntegrationCommand Command) {
        AggregateLifecycle.apply(new IntegrationEvent(Command.getIntegrationDto()));
    }
}
