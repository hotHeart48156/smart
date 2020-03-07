package org.users.commandhandle;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.dto.domainevent.UpdateJobEvent;
import org.users.executor.command.UpdateJobCommand;

/**
 * @author yangbiao
 */

public class UpdateJobCommandHandle {

    @CommandHandler
    public void updateJob(UpdateJobCommand updateJobCommand) {
        updateJobCommand.getJobDto().accept(this);
        AggregateLifecycle.apply(new UpdateJobEvent(updateJobCommand.getJobDto()));
    }

}
