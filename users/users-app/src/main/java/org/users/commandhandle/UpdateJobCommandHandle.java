package org.users.commandhandle;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
import org.users.domainevent.UpdateJobEvent;

/**
 * @author yangbiao
 */
@Component

public class UpdateJobCommandHandle {

    @CommandHandler
    public void updateJob(UpdateJobCommand updateJobCommand) {
        AggregateLifecycle.apply(new UpdateJobEvent(updateJobCommand.getJobDto()));
    }

}
