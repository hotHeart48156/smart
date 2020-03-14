package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class JobEvent {
    private JobDto JobDto;
}
