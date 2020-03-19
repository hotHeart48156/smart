package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.CouponAmountEvent;
import org.activite.executor.command.CouponAmountCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
@Value
@Component
public class CouponAmountCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(CouponAmountCommand Command) {
        AggregateLifecycle.apply(new CouponAmountEvent(Command.getCouponAmountDto()));
    }
}
