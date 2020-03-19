package org.activite.commandhandle;

import lombok.Value;
import org.activite.event.NoteEvent;
import org.activite.executor.command.NoteCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
@Value
@Component
public class NoteCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(NoteCommand Command) {
        AggregateLifecycle.apply(new NoteEvent(Command.getNoteDto()));
    }
}
