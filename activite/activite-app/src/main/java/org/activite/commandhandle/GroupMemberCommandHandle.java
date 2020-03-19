package org.activite.commandhandle;

import lombok.Value;

import org.axonframework.commandhandling.CommandHandler;
import org.activite.event.*;
import org.activite.executor.command.*;
import org.springframework.stereotype.Component;
@Value
@Component
public class GroupMemberCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(GroupMemberCommand Command) {
        AggregateLifecycle.apply(new GroupMemberEvent(Command.getGroupMemberDto()));
    }
}
