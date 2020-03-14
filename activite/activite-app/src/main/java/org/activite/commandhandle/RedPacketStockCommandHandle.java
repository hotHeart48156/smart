package org.activite.commandhandle;

import lombok.Value;

@Value
public class RedPacketStockCommandHandle {
    @CommandHandler
    public void on(RedPacketStockCommand Command) {
        AggregateLifecycle.apply(new RedPacketStockEvent(Command.getRedPacketStockDto()));
    }
}
