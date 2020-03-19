package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.CouponTypeEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

@Value
public class CouponTypeCommandHandle {
    @CommandHandler
    public void on(CouponTypeCommand Command) {
        AggregateLifecycle.apply(new CouponTypeEvent(Command.getCouponTypeDto()));
    }
}
