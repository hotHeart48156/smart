package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.event.PaymentTimeEvent;
import org.order.executor.command.aggre.PaymentTimeCommand;

@Value
public class PaymentTimeCommandHandle {
    @CommandHandler
    public void on(PaymentTimeCommand Command) {
        AggregateLifecycle.apply(new PaymentTimeEvent(Command.getPaymentTimeDto()));
    }
}
