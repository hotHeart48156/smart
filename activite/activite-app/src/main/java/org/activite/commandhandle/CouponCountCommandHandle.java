package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.CouponCountEvent;
import org.activite.executor.command.CouponCountCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
@Value
@Component
public class CouponCountCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(CouponCountCommand Command) {
        AggregateLifecycle.apply(new CouponCountEvent(Command.getCouponCountDto()));
    }
}
