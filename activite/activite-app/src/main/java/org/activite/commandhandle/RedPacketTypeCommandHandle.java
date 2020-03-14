package org.activite.commandhandle;

import lombok.Value;

@Value
public class RedPacketTypeCommandHandle {
    @CommandHandler
    public void on(RedPacketTypeCommand Command) {
        AggregateLifecycle.apply(new RedPacketTypeEvent(Command.getRedPacketTypeDto()));
    }
}
