package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class MemberLevelIdEvent {
    private org.users.dto.agg.MemberLevelIdDto MemberLevelIdDto;
}
