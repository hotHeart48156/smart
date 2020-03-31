package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.aggredto.DeleteStatusDto;

@Value
@AllArgsConstructor
public class DeleteStatusEvent {
    private org.order.dto.aggredto.DeleteStatusDto DeleteStatusDto;
}
