package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class SourceTypeEvent {
    private org.users.dto.agg.SourceTypeDto SourceTypeDto;
}
