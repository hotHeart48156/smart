package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.ActivityUserEvent;
import org.activite.executor.command.ActivityUserCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
@Value
@Component
public class ActivityUserCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(ActivityUserCommand Command) {
        AggregateLifecycle.apply(new ActivityUserEvent(Command.getActivityUserDto()));
    }
}
