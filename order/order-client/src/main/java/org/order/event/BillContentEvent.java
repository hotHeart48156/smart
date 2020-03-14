package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class BillContentEvent {
    private org.order.dto.aggredto.BillContentDto BillContentDto;
}
