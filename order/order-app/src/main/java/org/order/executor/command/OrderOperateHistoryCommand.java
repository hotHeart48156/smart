package org.order.executor.command;

import lombok.Value;
import org.order.dto.entitydto.OrderOperateHistoryDto;
@Value
public class OrderOperateHistoryCommand  extends AbstractCommand{
private OrderOperateHistoryDto  OrderOperateHistoryDto;
}
