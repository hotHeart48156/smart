package org.activite.commandhandle;

import lombok.Value;

@Value
public class CouponNameCommandHandle {
    @CommandHandler
    public void on(CouponNameCommand Command) {
        AggregateLifecycle.apply(new CouponNameEvent(Command.getCouponNameDto()));
    }
}
