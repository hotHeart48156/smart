package org.users.commandhandle;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
import org.users.domainevent.UpdateIntegrationEvent;

/**
 * @author yangbiao
 */
@Component

public class UpdateIntegrationCommandHandle {
    @CommandHandler
    public void integration(UpdateIntegrationCommand updateIntegrationCommand) {
        AggregateLifecycle.apply(new UpdateIntegrationEvent(updateIntegrationCommand.getIntegrationDto()));
    }
}
