package org.order.executor.command.entity;

import lombok.Value;

@Value
public class OrderItemCommand {
    private org.order.dto.entitydto.OrderItemDto OrderItemDto;
}
