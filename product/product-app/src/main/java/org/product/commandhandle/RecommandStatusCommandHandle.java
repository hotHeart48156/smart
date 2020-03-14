package org.product.commandhandle;

import lombok.Value;

@Value
public class RecommandStatusCommandHandle {
    @CommandHandler
    public void on(RecommandStatusCommand Command) {
        AggregateLifecycle.apply(new RecommandStatusEvent(Command.getRecommandStatusDto()));
    }
}
