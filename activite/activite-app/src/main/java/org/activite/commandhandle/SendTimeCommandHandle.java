package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.SendTimeEvent;
import org.activite.executor.command.SendTimeCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import org.springframework.stereotype.Component;
@Value
@Component
public class SendTimeCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(SendTimeCommand Command) {
        AggregateLifecycle.apply(new SendTimeEvent(Command.getSendTimeDto()));
    }
}
