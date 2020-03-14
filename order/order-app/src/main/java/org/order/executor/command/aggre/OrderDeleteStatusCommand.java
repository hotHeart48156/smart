package org.order.executor.command.aggre;

import lombok.Value;

@Value
public class OrderDeleteStatusCommand {
    private org.order.dto.aggredto.OrderDeleteStatusDto OrderDeleteStatusDto;
}
