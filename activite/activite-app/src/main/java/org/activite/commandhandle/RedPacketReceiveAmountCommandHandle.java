package org.activite.commandhandle;

import lombok.Value;

@Value
public class RedPacketReceiveAmountCommandHandle {
    @CommandHandler
    public void on(RedPacketReceiveAmountCommand Command) {
        AggregateLifecycle.apply(new RedPacketReceiveAmountEvent(Command.getRedPacketReceiveAmountDto()));
    }
}
