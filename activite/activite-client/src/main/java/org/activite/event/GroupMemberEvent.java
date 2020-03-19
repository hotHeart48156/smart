package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class GroupMemberEvent   extends AbstractEvent   {
    private org.activite.dto.entity.GroupMemberDto GroupMemberDto;
}
