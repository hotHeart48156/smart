package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.aggredto.GroupIdDto;

@Value
@AllArgsConstructor
public class GroupIdEvent {
    private org.order.dto.aggredto.GroupIdDto GroupIdDto;
}
