package org.order.commandhandle;

import lombok.Value;

@Value
public class BillContentCommandHandle {
    @CommandHandler
    public void on(BillContentCommand Command) {
        AggregateLifecycle.apply(new BillContentEvent(Command.getBillContentDto()));
    }
}
