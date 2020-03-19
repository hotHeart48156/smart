package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.CouponReceiverCountEvent;
import org.activite.executor.command.CouponReceiverCountCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
@Value
@Component
public class CouponReceiverCountCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(CouponReceiverCountCommand Command) {
        AggregateLifecycle.apply(new CouponReceiverCountEvent(Command.getCouponReceiverCountDto()));
    }
}
