package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.RedPacketCountEvent;
import org.activite.executor.command.RedPacketCountCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import org.springframework.stereotype.Component;
@Value
@Component
public class RedPacketCountCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(RedPacketCountCommand Command) {
        AggregateLifecycle.apply(new RedPacketCountEvent(Command.getRedPacketCountDto()));
    }
}
