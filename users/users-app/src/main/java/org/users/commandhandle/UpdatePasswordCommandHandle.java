package org.users.commandhandle;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.dto.domainevent.UpdatePasswordEvent;
import org.users.executor.command.UpdatePasswordCommand;

/**
 * @author yangbiao
 */

public class UpdatePasswordCommandHandle {
    @CommandHandler
    public void updatePassword(UpdatePasswordCommand updatePasswordCommand) {
        AggregateLifecycle.apply(new UpdatePasswordEvent(updatePasswordCommand.getPasswordDto()));
    }
}
