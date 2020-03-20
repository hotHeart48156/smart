package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.CouponUsedCountEvent;
import org.activite.executor.command.CouponUsedCountCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
@Value
@Component
public class CouponUsedCountCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(CouponUsedCountCommand Command) {
        AggregateLifecycle.apply(new CouponUsedCountEvent(Command.getCouponUsedCountDto()));
    }
}
