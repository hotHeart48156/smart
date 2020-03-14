package org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.event.NoteEvent;
import org.order.executor.command.aggre.NoteCommand;

@Value
public class NoteCommandHandle {
    @CommandHandler
    public void on(NoteCommand Command) {
        AggregateLifecycle.apply(new NoteEvent(Command.getNoteDto()));
    }
}
