package org.product.commandhandle;

import lombok.Value;

@Value
public class PublishStatusCommandHandle {
    @CommandHandler
    public void on(PublishStatusCommand Command) {
        AggregateLifecycle.apply(new PublishStatusEvent(Command.getPublishStatusDto()));
    }
}
