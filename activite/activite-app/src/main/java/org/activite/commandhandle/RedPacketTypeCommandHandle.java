package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.RedPacketTypeEvent;
import org.activite.executor.command.RedPacketTypeCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import org.springframework.stereotype.Component;
@Value
@Component
public class RedPacketTypeCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(RedPacketTypeCommand Command) {
        AggregateLifecycle.apply(new RedPacketTypeEvent(Command.getRedPacketTypeDto()));
    }
}
