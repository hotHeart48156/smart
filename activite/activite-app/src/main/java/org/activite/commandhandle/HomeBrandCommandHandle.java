package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.HomeBrandEvent;
import org.activite.executor.command.HomeBrandCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
@Value
@Component
public class HomeBrandCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(HomeBrandCommand Command) {
        AggregateLifecycle.apply(new HomeBrandEvent(Command.getHomeBrandDto()));
    }
}
