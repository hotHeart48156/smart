package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.CouponPublishCountEvent;
import org.activite.executor.command.CouponPublishCountCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import org.springframework.stereotype.Component;
@Value
@Component
public class CouponPublishCountCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(CouponPublishCountCommand Command) {
        AggregateLifecycle.apply(new CouponPublishCountEvent(Command.getCouponPublishCountDto()));
    }
}
