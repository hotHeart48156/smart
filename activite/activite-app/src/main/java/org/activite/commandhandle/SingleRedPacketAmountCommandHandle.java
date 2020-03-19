package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.SingleRedPacketAmountEvent;
import org.activite.executor.command.SingleRedPacketAmountCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import org.springframework.stereotype.Component;
@Value
@Component
public class SingleRedPacketAmountCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(SingleRedPacketAmountCommand Command) {
        AggregateLifecycle.apply(new SingleRedPacketAmountEvent(Command.getSingleRedPacketAmountDto()));
    }
}
