package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.event.OrderSettingEvent;
import org.order.executor.command.entity.OrderSettingCommand;

@Value
public class OrderSettingCommandHandle {
    @CommandHandler
    public void on(OrderSettingCommand Command) {
        AggregateLifecycle.apply(new OrderSettingEvent(Command.getOrderSettingDto()));
    }
}
