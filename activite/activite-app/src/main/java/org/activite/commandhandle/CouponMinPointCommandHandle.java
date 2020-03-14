package org.activite.commandhandle;

import lombok.Value;

@Value
public class CouponMinPointCommandHandle {
    @CommandHandler
    public void on(CouponMinPointCommand Command) {
        AggregateLifecycle.apply(new CouponMinPointEvent(Command.getCouponMinPointDto()));
    }
}
