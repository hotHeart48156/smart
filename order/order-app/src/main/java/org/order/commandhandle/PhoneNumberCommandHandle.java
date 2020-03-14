package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.event.PhoneNumberEvent;
import org.order.executor.command.aggre.PhoneNumberCommand;

@Value
public class PhoneNumberCommandHandle {
    @CommandHandler
    public void on(PhoneNumberCommand Command) {
        AggregateLifecycle.apply(new PhoneNumberEvent(Command.getPhoneNumberDto()));
    }
}
