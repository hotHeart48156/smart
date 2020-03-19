package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.CouponTypeEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import org.activite.executor.command.*;
import org.springframework.stereotype.Component;

import org.springframework.stereotype.Component;
@Value
@Component
public class CouponTypeCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(CouponTypeCommand Command) {
        AggregateLifecycle.apply(new CouponTypeEvent(Command.getCouponTypeDto()));
    }
}
