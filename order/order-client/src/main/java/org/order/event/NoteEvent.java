package org.order.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class NoteEvent {
    private NoteDto NoteDto;
}
