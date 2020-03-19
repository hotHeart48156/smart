package org.activite.commandhandle;

import lombok.Value;

import org.axonframework.commandhandling.CommandHandler;
import org.activite.event.*;
import org.activite.executor.command.*;
import org.springframework.stereotype.Component;
@Value
@Component
public class RecommendProductCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(RecommendProductCommand Command) {
        AggregateLifecycle.apply(new RecommendProductEvent(Command.getRecommendProductDto()));
    }
}
