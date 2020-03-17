package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class MemberLevelEvent {
    private org.users.dto.entity.MemberLevelDto MemberLevelDto;
}
