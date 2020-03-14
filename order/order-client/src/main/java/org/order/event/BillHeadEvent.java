package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class BillHeadEvent {
    private org.order.dto.aggredto.BillHeadDto BillHeadDto;
}
