package org.order.executor.command;

import lombok.Value;

@Value
public class GrowthCommand  extends AbstractCommand{
private org.order.dto.aggredto.GrowthDto GrowthDto;
}
