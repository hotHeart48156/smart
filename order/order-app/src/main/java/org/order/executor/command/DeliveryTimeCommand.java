package org.order.executor.command;

import lombok.Value;

@Value
public class DeliveryTimeCommand  extends AbstractCommand{
private org.order.dto.aggredto.DeliveryTimeDto DeliveryTimeDto;
}
