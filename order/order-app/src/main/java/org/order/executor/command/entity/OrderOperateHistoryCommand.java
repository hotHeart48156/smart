package org.order.executor.command.entity;

import lombok.Value;

@Value
public class OrderOperateHistoryCommand {
    private org.order.dto.entitydto.OrderOperateHistoryDto OrderOperateHistoryDto;
}
