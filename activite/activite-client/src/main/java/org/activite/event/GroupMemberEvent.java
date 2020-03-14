package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class GroupMemberEvent {
    private GroupMemberDto GroupMemberDto;
}
