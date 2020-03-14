package org.activite.commandhandle;

import lombok.Value;

@Value
public class SingleRedPacketAmountCommandHandle {
    @CommandHandler
    public void on(SingleRedPacketAmountCommand Command) {
        AggregateLifecycle.apply(new SingleRedPacketAmountEvent(Command.getSingleRedPacketAmountDto()));
    }
}
