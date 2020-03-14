package org.activite.commandhandle;

import lombok.Value;

@Value
public class CouponIdCommandHandle {
    @CommandHandler
    public void on(CouponIdCommand Command) {
        AggregateLifecycle.apply(new CouponIdEvent(Command.getCouponIdDto()));
    }
}
