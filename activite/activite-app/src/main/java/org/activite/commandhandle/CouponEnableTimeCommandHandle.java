package org.activite.commandhandle;

import lombok.Value;

@Value
public class CouponEnableTimeCommandHandle {
    @CommandHandler
    public void on(CouponEnableTimeCommand Command) {
        AggregateLifecycle.apply(new CouponEnableTimeEvent(Command.getCouponEnableTimeDto()));
    }
}
