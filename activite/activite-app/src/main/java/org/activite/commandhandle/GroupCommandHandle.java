package org.activite.commandhandle;

import lombok.Value;

import org.axonframework.commandhandling.CommandHandler;
import org.activite.event.*;
import org.activite.executor.command.*;
import org.springframework.stereotype.Component;
@Value
@Component
public class GroupCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(GroupCommand Command) {
        AggregateLifecycle.apply(new GroupEvent(Command.getGroupDto()));
    }
}
