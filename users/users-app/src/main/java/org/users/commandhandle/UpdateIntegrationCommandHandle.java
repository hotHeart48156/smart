package org.users.commandhandle;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.dto.domainevent.UpdateIntegrationEvent;
import org.users.executor.command.UpdateIntegrationCommand;

/**
 * @author yangbiao
 */

public class UpdateIntegrationCommandHandle {
    @CommandHandler
    public void integration(UpdateIntegrationCommand updateIntegrationCommand) {
        AggregateLifecycle.apply(new UpdateIntegrationEvent(updateIntegrationCommand.getIntegrationDto()));
    }
}
