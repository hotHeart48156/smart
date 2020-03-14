package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.event.ReceiverNameEvent;
import org.order.executor.command.aggre.ReceiverNameCommand;

@Value
public class ReceiverNameCommandHandle {
    @CommandHandler
    public void on(ReceiverNameCommand Command) {
        AggregateLifecycle.apply(new ReceiverNameEvent(Command.getReceiverNameDto()));
    }
}
