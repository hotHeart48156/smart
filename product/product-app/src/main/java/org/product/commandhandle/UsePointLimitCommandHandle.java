package org.product.commandhandle;

import lombok.Value;

@Value
public class UsePointLimitCommandHandle {
    @CommandHandler
    public void on(UsePointLimitCommand Command) {
        AggregateLifecycle.apply(new UsePointLimitEvent(Command.getUsePointLimitDto()));
    }
}
