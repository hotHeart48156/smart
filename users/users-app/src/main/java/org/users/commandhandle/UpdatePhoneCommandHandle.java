package org.users.commandhandle;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.executor.command.UpdatePhoneCommand;

/**
 * @author yangbiao
 */

public class UpdatePhoneCommandHandle {
    @CommandHandler
    public void updatePhone(UpdatePhoneCommand updatePhoneCommand) {
        AggregateLifecycle.apply(new UpdatePhoneCommand(updatePhoneCommand.getPhoneDto()));
    }

}
