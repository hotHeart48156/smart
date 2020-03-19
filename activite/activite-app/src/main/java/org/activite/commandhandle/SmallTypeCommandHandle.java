package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.SmallTypeEvent;
import org.activite.executor.command.SmallTypeCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import org.springframework.stereotype.Component;
@Value
@Component
public class SmallTypeCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(SmallTypeCommand Command) {
        AggregateLifecycle.apply(new SmallTypeEvent(Command.getSmallTypeDto()));
    }
}
