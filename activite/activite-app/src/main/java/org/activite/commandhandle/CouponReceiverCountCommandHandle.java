package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.CouponReceiverCountEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

@Value
public class CouponReceiverCountCommandHandle {
    @CommandHandler
    public void on(CouponReceiverCountCommand Command) {
        AggregateLifecycle.apply(new CouponReceiverCountEvent(Command.getCouponReceiverCountDto()));
    }
}
