package org.order.executor.command.aggre;

import lombok.Value;

@Value
public class OrderStatusCommand {
    private org.order.dto.aggredto.OrderStatusDto OrderStatusDto;
}
