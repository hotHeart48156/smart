package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class GroupEvent   extends AbstractEvent{
    private org.activite.dto.entity.GroupDto GroupDto;
}
