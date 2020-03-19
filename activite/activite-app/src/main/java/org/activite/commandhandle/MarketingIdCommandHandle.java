package org.activite.commandhandle;

import lombok.Value;

import org.axonframework.commandhandling.CommandHandler;

import org.activite.executor.command.*;
import org.springframework.stereotype.Component;
@Value
@Component
public class MarketingIdCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(MarketingIdCommand Command) {
        AggregateLifecycle.apply(new MarketingIdEvent(Command.getMarketingIdDto()));
    }
}
