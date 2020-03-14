package org.activite.commandhandle;

import lombok.Value;

@Value
public class RedPacketCountCommandHandle {
    @CommandHandler
    public void on(RedPacketCountCommand Command) {
        AggregateLifecycle.apply(new RedPacketCountEvent(Command.getRedPacketCountDto()));
    }
}
