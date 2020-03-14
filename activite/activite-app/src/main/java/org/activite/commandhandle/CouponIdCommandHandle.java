package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.CouponIdEvent;
import org.activite.executor.command.CouponIdCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

@Value
public class CouponIdCommandHandle {
    @CommandHandler
    public void on(CouponIdCommand Command) {
        AggregateLifecycle.apply(new CouponIdEvent(Command.getCouponIdDto()));
    }
}
