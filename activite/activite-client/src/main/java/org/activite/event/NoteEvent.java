package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class NoteEvent   extends AbstractEvent  {
    private org.activite.dto.agg.NoteDto NoteDto;
}
