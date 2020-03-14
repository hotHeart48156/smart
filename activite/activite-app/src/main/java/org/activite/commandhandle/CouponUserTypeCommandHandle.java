package org.activite.commandhandle;

import lombok.Value;

@Value
public class CouponUserTypeCommandHandle {
    @CommandHandler
    public void on(CouponUserTypeCommand Command) {
        AggregateLifecycle.apply(new CouponUserTypeEvent(Command.getCouponUserTypeDto()));
    }
}
