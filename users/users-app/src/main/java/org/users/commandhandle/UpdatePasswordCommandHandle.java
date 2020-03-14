package org.users.commandhandle;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
import org.users.domainevent.UpdatePasswordEvent;

/**
 * @author yangbiao
 */
@Component

public class UpdatePasswordCommandHandle {
    @CommandHandler
    public void updatePassword(UpdatePasswordCommand updatePasswordCommand) {
        AggregateLifecycle.apply(new UpdatePasswordEvent(updatePasswordCommand.getPasswordDto()));
    }
}
