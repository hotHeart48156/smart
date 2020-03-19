package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.RedPacketReceiveAmountEvent;
import org.activite.executor.command.RedPacketReceiveAmountCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import org.springframework.stereotype.Component;
@Value
@Component
public class RedPacketReceiveAmountCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(RedPacketReceiveAmountCommand Command) {
        AggregateLifecycle.apply(new RedPacketReceiveAmountEvent(Command.getRedPacketReceiveAmountDto()));
    }
}
