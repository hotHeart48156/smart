package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.DiscountTypeEvent;
import org.activite.executor.command.DiscountTypeCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
@Value
@Component
public class DiscountTypeCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(DiscountTypeCommand Command) {
        AggregateLifecycle.apply(new DiscountTypeEvent(Command.getDiscountTypeDto()));
    }
}
