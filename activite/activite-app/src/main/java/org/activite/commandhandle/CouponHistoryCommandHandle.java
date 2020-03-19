package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.CouponHistoryEvent;
import org.activite.executor.command.CouponHistoryCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
@Value
@Component
public class CouponHistoryCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(CouponHistoryCommand Command) {
        AggregateLifecycle.apply(new CouponHistoryEvent(Command.getCouponHistoryDto()));
    }
}
