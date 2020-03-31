package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.OrderCreateDto;

@Value
@AllArgsConstructor
public class OrderCreateEvent {
    private OrderCreateDto OrderCreateDto;

}











