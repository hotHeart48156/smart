package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.event.GrowthEvent;
import org.order.executor.command.aggre.GrowthCommand;

@Value
public class GrowthCommandHandle {
    @CommandHandler
    public void on(GrowthCommand Command) {
        AggregateLifecycle.apply(new GrowthEvent(Command.getGrowthDto()));
    }
}
