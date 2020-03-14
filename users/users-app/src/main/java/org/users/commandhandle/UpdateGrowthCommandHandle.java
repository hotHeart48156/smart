package org.users.commandhandle;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
import org.users.dto.domainevent.UpdateGrowthEvent;
import org.users.executor.command.UpdateGrowthCommand;

/**
 * @author yangbiao
 */
@Component

public class UpdateGrowthCommandHandle {
    @CommandHandler
    public void growth(UpdateGrowthCommand updateGrowthCommand) {
        AggregateLifecycle.apply(new UpdateGrowthEvent(updateGrowthCommand.getGrowthDto()));
    }
}
