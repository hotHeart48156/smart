package org.order.executor.command;

import lombok.Value;
import org.order.dto.entitydto.OrderReturnApplyDto;
@Value
public class OrderReturnApplyCommand  extends AbstractCommand{
private OrderReturnApplyDto  OrderReturnApplyDto;
}
