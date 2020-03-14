package org.activite.commandhandle;

import lombok.Value;

@Value
public class CouponPublishCountCommandHandle {
    @CommandHandler
    public void on(CouponPublishCountCommand Command) {
        AggregateLifecycle.apply(new CouponPublishCountEvent(Command.getCouponPublishCountDto()));
    }
}
