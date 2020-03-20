package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.CouponUserTypeEvent;
import org.activite.executor.command.CouponUserTypeCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
@Value
@Component
public class CouponUserTypeCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(CouponUserTypeCommand Command) {
        AggregateLifecycle.apply(new CouponUserTypeEvent(Command.getCouponUserTypeDto()));
    }
}
