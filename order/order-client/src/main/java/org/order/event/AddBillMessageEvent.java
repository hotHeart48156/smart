package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class AddBillMessageEvent {
    private org.order.dto.aggredto.AddBillMessageDto AddBillMessageDto;
}
