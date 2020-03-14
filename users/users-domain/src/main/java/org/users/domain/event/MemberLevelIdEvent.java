package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class MemberLevelIdEvent {
    private MemberLevelIdDto MemberLevelIdDto;
}
