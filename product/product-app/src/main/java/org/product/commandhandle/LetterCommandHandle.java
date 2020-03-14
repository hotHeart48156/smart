package org.product.commandhandle;

import lombok.Value;

@Value
public class LetterCommandHandle {
    @CommandHandler
    public void on(LetterCommand Command) {
        AggregateLifecycle.apply(new LetterEvent(Command.getLetterDto()));
    }
}
