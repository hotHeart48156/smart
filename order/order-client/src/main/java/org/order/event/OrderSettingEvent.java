package org.order.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class OrderSettingEvent {
    private OrderSettingDto OrderSettingDto;
}
