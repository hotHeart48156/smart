package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class NickNameEvent {
    private NickNameDto NickNameDto;
}
