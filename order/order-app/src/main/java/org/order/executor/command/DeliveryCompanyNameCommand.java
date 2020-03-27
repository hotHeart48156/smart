package org.order.executor.command;

import lombok.Value;

@Value
public class DeliveryCompanyNameCommand  extends AbstractCommand{
private org.order.dto.aggredto.DeliveryCompanyNameDto DeliveryCompanyNameDto;
}
