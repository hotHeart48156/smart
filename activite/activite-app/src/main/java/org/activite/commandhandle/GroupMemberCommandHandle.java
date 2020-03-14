package org.activite.commandhandle;

import lombok.Value;

@Value
public class GroupMemberCommandHandle {
    @CommandHandler
    public void on(GroupMemberCommand Command) {
        AggregateLifecycle.apply(new GroupMemberEvent(Command.getGroupMemberDto()));
    }
}
