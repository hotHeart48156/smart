package org.order.executor.command;

import lombok.Value;
import org.order.dto.aggredto.IntegrationDto;

@Value
public class IntegrationCommand  extends AbstractCommand{
private IntegrationDto  IntegrationDto;
}
