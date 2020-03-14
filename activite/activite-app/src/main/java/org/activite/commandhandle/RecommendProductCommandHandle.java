package org.activite.commandhandle;

import lombok.Value;

@Value
public class RecommendProductCommandHandle {
    @CommandHandler
    public void on(RecommendProductCommand Command) {
        AggregateLifecycle.apply(new RecommendProductEvent(Command.getRecommendProductDto()));
    }
}
