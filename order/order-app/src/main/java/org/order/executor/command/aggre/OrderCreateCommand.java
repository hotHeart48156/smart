package org.order.executor.command.aggre;

import lombok.Value;

@Value
public class OrderCreateCommand {
    private org.order.dto.aggredto.OrderCreateDto OrderCreateDto;
}
