package org.activite.commandhandle;

import lombok.Value;

@Value
public class CouponAmountCommandHandle {
    @CommandHandler
    public void on(CouponAmountCommand Command) {
        AggregateLifecycle.apply(new CouponAmountEvent(Command.getCouponAmountDto()));
    }
}
