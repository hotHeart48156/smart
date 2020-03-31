package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.aggredto.OrderDeleteStatusDto;

@Value
@AllArgsConstructor
public class OrderDeleteStatusEvent {
    private org.order.dto.aggredto.OrderDeleteStatusDto OrderDeleteStatusDto;
}
