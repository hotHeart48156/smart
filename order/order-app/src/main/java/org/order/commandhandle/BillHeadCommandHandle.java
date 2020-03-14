package org.order.commandhandle;

import lombok.Value;

@Value
public class BillHeadCommandHandle {
    @CommandHandler
    public void on(BillHeadCommand Command) {
        AggregateLifecycle.apply(new BillHeadEvent(Command.getBillHeadDto()));
    }
}
