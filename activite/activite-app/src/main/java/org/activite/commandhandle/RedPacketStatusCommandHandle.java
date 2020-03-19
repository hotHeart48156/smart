package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.RedPacketStatusEvent;
import org.activite.executor.command.RedPacketStatusCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import org.springframework.stereotype.Component;
@Value
@Component
public class RedPacketStatusCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(RedPacketStatusCommand Command) {
        AggregateLifecycle.apply(new RedPacketStatusEvent(Command.getRedPacketStatusDto()));
    }
}
