package org.activite.commandhandle;

import lombok.Value;

@Value
public class CouponTypeCommandHandle {
    @CommandHandler
    public void on(CouponTypeCommand Command) {
        AggregateLifecycle.apply(new CouponTypeEvent(Command.getCouponTypeDto()));
    }
}
