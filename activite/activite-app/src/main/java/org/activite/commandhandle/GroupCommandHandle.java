package org.activite.commandhandle;

import lombok.Value;

@Value
public class GroupCommandHandle {
    @CommandHandler
    public void on(GroupCommand Command) {
        AggregateLifecycle.apply(new GroupEvent(Command.getGroupDto()));
    }
}
