package org.order.executor.command;

import lombok.Value;
import org.order.dto.entitydto.OrderReturnReasonDto;
@Value
public class OrderReturnReasonCommand  extends AbstractCommand{
private OrderReturnReasonDto  OrderReturnReasonDto;
}
