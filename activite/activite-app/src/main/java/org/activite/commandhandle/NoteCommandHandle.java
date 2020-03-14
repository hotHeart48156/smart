package org.activite.commandhandle;

import lombok.Value;

@Value
public class NoteCommandHandle {
    @CommandHandler
    public void on(NoteCommand Command) {
        AggregateLifecycle.apply(new NoteEvent(Command.getNoteDto()));
    }
}
