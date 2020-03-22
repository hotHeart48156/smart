package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.RecommendProductEvent;
import org.activite.executor.command.RecommendProductCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
@Value
@Component
public class RecommendProductCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(RecommendProductCommand Command) {
        AggregateLifecycle.apply(new RecommendProductEvent(Command.getRecommendProductDto()));
    }
}
