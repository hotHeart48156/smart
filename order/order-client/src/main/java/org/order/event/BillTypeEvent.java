package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class BillTypeEvent {
    private org.order.dto.aggredto.BillTypeDto BillTypeDto;
}
