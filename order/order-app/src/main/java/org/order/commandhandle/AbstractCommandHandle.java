package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

@Value
public class AbstractCommandHandle {
    @CommandHandler
    public void on(AbstractCommand Command) {
        AggregateLifecycle.apply(new AbstractEvent(Command.getAbstractDto()));
    }
}
