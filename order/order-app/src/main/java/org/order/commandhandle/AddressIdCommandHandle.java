package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.event.AddressIdEvent;
import org.order.executor.command.aggre.AddressIdCommand;

@Value
public class AddressIdCommandHandle {
    @CommandHandler
    public void on(AddressIdCommand Command) {
        AggregateLifecycle.apply(new AddressIdEvent(Command.getAddressIdDto()));
    }
}
