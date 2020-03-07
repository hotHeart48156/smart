package org.users.commandhandle;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.dto.domainevent.UpdateGrowthEvent;
import org.users.executor.command.UpdateGrowthCommand;

/**
 * @author yangbiao
 */

public class UpdateGrowthCommandHandle {
    @CommandHandler
    public void growth(UpdateGrowthCommand updateGrowthCommand) {
        updateGrowthCommand.getGrowthDto().accept(this);
        AggregateLifecycle.apply(new UpdateGrowthEvent(updateGrowthCommand.getGrowthDto()));
    }
}
