package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.RedPacketStockEvent;
import org.activite.executor.command.RedPacketStockCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import org.springframework.stereotype.Component;
@Value
@Component
public class RedPacketStockCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(RedPacketStockCommand Command) {
        AggregateLifecycle.apply(new RedPacketStockEvent(Command.getRedPacketStockDto()));
    }
}
