package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.entitydto.OrderSettingDto;

@Value
@AllArgsConstructor
public class OrderSettingEvent {
    private org.order.dto.entitydto.OrderSettingDto OrderSettingDto;
}
