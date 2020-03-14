package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.event.AutoConfirmTimeEvent;
import org.order.executor.command.aggre.AutoConfirmTimeCommand;

@Value
public class AutoConfirmTimeCommandHandle {
    @CommandHandler
    public void on(AutoConfirmTimeCommand Command) {
        AggregateLifecycle.apply(new AutoConfirmTimeEvent(Command.getAutoConfirmTimeDto()));
    }
}
