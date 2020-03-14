package org.activite.commandhandle;

import lombok.Value;

@Value
public class CouponUsedCountCommandHandle {
    @CommandHandler
    public void on(CouponUsedCountCommand Command) {
        AggregateLifecycle.apply(new CouponUsedCountEvent(Command.getCouponUsedCountDto()));
    }
}
