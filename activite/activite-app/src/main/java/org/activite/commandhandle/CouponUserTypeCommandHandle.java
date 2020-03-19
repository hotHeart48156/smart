package org.activite.commandhandle;

import lombok.Value;

import org.axonframework.commandhandling.CommandHandler;
import org.activite.event.*;
import org.activite.executor.command.*;
import org.springframework.stereotype.Component;
@Value
@Component
public class CouponUserTypeCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(CouponUserTypeCommand Command) {
        AggregateLifecycle.apply(new CouponUserTypeEvent(Command.getCouponUserTypeDto()));
    }
}
