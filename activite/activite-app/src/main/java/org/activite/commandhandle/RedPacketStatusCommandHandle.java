package org.activite.commandhandle;

import lombok.Value;

@Value
public class RedPacketStatusCommandHandle {
    @CommandHandler
    public void on(RedPacketStatusCommand Command) {
        AggregateLifecycle.apply(new RedPacketStatusEvent(Command.getRedPacketStatusDto()));
    }
}
