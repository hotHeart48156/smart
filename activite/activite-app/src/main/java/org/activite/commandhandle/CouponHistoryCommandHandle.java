package org.activite.commandhandle;

import lombok.Value;

@Value
public class CouponHistoryCommandHandle {
    @CommandHandler
    public void on(CouponHistoryCommand Command) {
        AggregateLifecycle.apply(new CouponHistoryEvent(Command.getCouponHistoryDto()));
    }
}
