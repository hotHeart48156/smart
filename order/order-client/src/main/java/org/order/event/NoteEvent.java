package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.aggredto.NoteDto;

@Value
@AllArgsConstructor
public class NoteEvent {
    private org.order.dto.aggredto.NoteDto NoteDto;
}
