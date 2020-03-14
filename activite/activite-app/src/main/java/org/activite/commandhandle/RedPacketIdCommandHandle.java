package org.activite.commandhandle;

import lombok.Value;

@Value
public class RedPacketIdCommandHandle {
    @CommandHandler
    public void on(RedPacketIdCommand Command) {
        AggregateLifecycle.apply(new RedPacketIdEvent(Command.getRedPacketIdDto()));
    }
}
