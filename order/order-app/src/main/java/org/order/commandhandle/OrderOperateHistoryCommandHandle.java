package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.event.OrderOperateHistoryEvent;
import org.order.executor.command.entity.OrderOperateHistoryCommand;

@Value
public class OrderOperateHistoryCommandHandle {
    @CommandHandler
    public void on(OrderOperateHistoryCommand Command) {
        AggregateLifecycle.apply(new OrderOperateHistoryEvent(Command.getOrderOperateHistoryDto()));
    }
}
