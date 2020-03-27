package org.order.executor.command;

import lombok.Value;
import org.order.dto.entitydto.OrderSettingDto;
@Value
public class OrderSettingCommand  extends AbstractCommand{
private OrderSettingDto  OrderSettingDto;
}
