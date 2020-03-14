package org.activite.commandhandle;

import lombok.Value;

@Value
public class RedPacketAmountCommandHandle {
    @CommandHandler
    public void on(RedPacketAmountCommand Command) {
        AggregateLifecycle.apply(new RedPacketAmountEvent(Command.getRedPacketAmountDto()));
    }
}
