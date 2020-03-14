package org.activite.commandhandle;

import lombok.Value;

@Value
public class CouponCountCommandHandle {
    @CommandHandler
    public void on(CouponCountCommand Command) {
        AggregateLifecycle.apply(new CouponCountEvent(Command.getCouponCountDto()));
    }
}
