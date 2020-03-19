package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.GiftEvent;
import org.activite.executor.command.GiftCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import org.springframework.stereotype.Component;
@Value
@Component
public class GiftCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(GiftCommand Command) {
        AggregateLifecycle.apply(new GiftEvent(Command.getGiftDto()));
    }
}
