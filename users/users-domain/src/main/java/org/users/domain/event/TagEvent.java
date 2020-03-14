package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class TagEvent {
    private TagDto TagDto;
}
