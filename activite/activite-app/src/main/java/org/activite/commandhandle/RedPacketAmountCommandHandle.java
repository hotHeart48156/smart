package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.RedPacketAmountEvent;
import org.activite.executor.command.RedPacketAmountCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import org.springframework.stereotype.Component;
@Value
@Component
public class RedPacketAmountCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(RedPacketAmountCommand Command) {
        AggregateLifecycle.apply(new RedPacketAmountEvent(Command.getRedPacketAmountDto()));
    }
}
