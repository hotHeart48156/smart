package org.order.executor.command;

import lombok.Value;
import org.order.dto.aggredto.DeliverySnDto;

@Value
public class DeliverySnCommand  extends AbstractCommand{
private DeliverySnDto  DeliverySnDto;
}
