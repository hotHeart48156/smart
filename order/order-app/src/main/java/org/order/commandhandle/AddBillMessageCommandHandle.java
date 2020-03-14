package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.event.AddBillMessageEvent;
import org.order.executor.command.aggre.AddBillMessageCommand;

@Value
public class AddBillMessageCommandHandle {
    @CommandHandler
    public void on(AddBillMessageCommand Command) {
        AggregateLifecycle.apply(new AddBillMessageEvent(Command.getAddBillMessageDto()));
    }
}
