package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.CouponEnableTimeEvent;
import org.activite.executor.command.CouponEnableTimeCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
@Value
@Component
public class CouponEnableTimeCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(CouponEnableTimeCommand Command) {
        AggregateLifecycle.apply(new CouponEnableTimeEvent(Command.getCouponEnableTimeDto()));
    }
}
