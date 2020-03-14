package org.activite.commandhandle;

import lombok.Value;

@Value
public class CouponCodeCommandHandle {
    @CommandHandler
    public void on(CouponCodeCommand Command) {
        AggregateLifecycle.apply(new CouponCodeEvent(Command.getCouponCodeDto()));
    }
}
