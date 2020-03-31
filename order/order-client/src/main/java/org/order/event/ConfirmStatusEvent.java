package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.aggredto.ConfirmStatusDto;

@Value
@AllArgsConstructor
public class ConfirmStatusEvent {
    private org.order.dto.aggredto.ConfirmStatusDto ConfirmStatusDto;
}
