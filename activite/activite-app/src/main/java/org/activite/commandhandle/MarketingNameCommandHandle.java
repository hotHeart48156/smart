package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.MarketingNameEvent;
import org.activite.executor.command.MarketingNameCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
@Value
@Component
public class MarketingNameCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(MarketingNameCommand Command) {
        AggregateLifecycle.apply(new MarketingNameEvent(Command.getMarketingNameDto()));
    }
}
