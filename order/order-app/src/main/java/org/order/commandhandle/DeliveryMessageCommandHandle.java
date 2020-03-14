package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.event.DeliveryMessageEvent;
import org.order.executor.command.aggre.DeliveryMessageCommand;

@Value
public class DeliveryMessageCommandHandle {
    @CommandHandler
    public void on(DeliveryMessageCommand Command) {
        AggregateLifecycle.apply(new DeliveryMessageEvent(Command.getDeliveryMessageDto()));
    }
}
