package org.activite.commandhandle;

import lombok.Value;

@Value
public class UserLevelCommandHandle {
    @CommandHandler
    public void on(UserLevelCommand Command) {
        AggregateLifecycle.apply(new UserLevelEvent(Command.getUserLevelDto()));
    }
}
