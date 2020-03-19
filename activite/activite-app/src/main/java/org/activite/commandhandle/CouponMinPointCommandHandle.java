package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.CouponMinPointEvent;
import org.activite.executor.command.CouponMinPointCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import org.springframework.stereotype.Component;
@Value
@Component
public class CouponMinPointCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(CouponMinPointCommand Command) {
        AggregateLifecycle.apply(new CouponMinPointEvent(Command.getCouponMinPointDto()));
    }
}
