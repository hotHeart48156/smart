package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class SourceTypeEvent {
    private SourceTypeDto SourceTypeDto;
}
