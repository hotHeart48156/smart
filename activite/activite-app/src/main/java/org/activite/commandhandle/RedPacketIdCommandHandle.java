package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.RedPacketIdEvent;
import org.activite.executor.command.RedPacketIdCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import org.springframework.stereotype.Component;
@Value
@Component
public class RedPacketIdCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(RedPacketIdCommand Command) {
        AggregateLifecycle.apply(new RedPacketIdEvent(Command.getRedPacketIdDto()));
    }
}
