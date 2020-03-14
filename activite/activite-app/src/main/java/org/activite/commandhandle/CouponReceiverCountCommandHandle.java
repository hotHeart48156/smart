package org.activite.commandhandle;

import lombok.Value;

@Value
public class CouponReceiverCountCommandHandle {
    @CommandHandler
    public void on(CouponReceiverCountCommand Command) {
        AggregateLifecycle.apply(new CouponReceiverCountEvent(Command.getCouponReceiverCountDto()));
    }
}
