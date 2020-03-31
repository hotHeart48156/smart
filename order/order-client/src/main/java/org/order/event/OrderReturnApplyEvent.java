package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.entitydto.OrderReturnApplyDto;

@Value
@AllArgsConstructor
public class OrderReturnApplyEvent {
    private org.order.dto.entitydto.OrderReturnApplyDto OrderReturnApplyDto;
}
