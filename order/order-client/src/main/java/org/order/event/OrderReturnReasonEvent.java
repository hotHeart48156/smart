package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.entitydto.OrderReturnReasonDto;

@Value
@AllArgsConstructor
public class OrderReturnReasonEvent {
    private org.order.dto.entitydto.OrderReturnReasonDto OrderReturnReasonDto;
}
