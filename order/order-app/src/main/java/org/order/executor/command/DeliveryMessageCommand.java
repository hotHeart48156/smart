package org.order.executor.command;

import lombok.Value;
import org.order.dto.aggredto.DeliveryMessageDto;

@Value
public class DeliveryMessageCommand  extends AbstractCommand{
private DeliveryMessageDto  DeliveryMessageDto;
}
