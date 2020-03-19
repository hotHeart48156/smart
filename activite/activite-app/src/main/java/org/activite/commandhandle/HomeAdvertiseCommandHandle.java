package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.HomeAdvertiseEvent;
import org.activite.executor.command.HomeAdvertiseCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import org.springframework.stereotype.Component;
@Value
@Component
public class HomeAdvertiseCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(HomeAdvertiseCommand Command) {
        AggregateLifecycle.apply(new HomeAdvertiseEvent(Command.getHomeAdvertiseDto()));
    }
}
