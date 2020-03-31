package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class AutoConfirmTimeEvent {
    private org.order.dto.aggredto.AutoConfirmTimeDto AutoConfirmTimeDto;
}
