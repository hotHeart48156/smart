package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.CouponCodeEvent;
import org.activite.executor.command.CouponCodeCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
@Value
@Component
public class CouponCodeCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(CouponCodeCommand Command) {
        AggregateLifecycle.apply(new CouponCodeEvent(Command.getCouponCodeDto()));
    }
}
