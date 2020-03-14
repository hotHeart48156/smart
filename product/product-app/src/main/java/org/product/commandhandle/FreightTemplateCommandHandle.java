package org.product.commandhandle;

import lombok.Value;

@Value
public class FreightTemplateCommandHandle {
    @CommandHandler
    public void on(FreightTemplateCommand Command) {
        AggregateLifecycle.apply(new FreightTemplateEvent(Command.getFreightTemplateDto()));
    }
}
