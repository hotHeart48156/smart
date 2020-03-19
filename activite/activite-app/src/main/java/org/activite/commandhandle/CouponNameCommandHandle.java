package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.CouponNameEvent;
import org.activite.executor.command.CouponNameCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
@Value
@Component
public class CouponNameCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(CouponNameCommand Command) {
        AggregateLifecycle.apply(new CouponNameEvent(Command.getCouponNameDto()));
    }
}
