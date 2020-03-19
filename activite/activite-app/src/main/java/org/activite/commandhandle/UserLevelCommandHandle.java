package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.UserLevelEvent;
import org.activite.executor.command.UserLevelCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import org.springframework.stereotype.Component;
@Value
@Component
public class UserLevelCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(UserLevelCommand command) {
        AggregateLifecycle.apply(new UserLevelEvent(command.getUserLevelDto()));
    }
}
