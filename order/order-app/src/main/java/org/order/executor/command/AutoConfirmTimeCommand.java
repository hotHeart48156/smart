package org.order.executor.command;

import lombok.Value;

@Value
public class AutoConfirmTimeCommand  extends AbstractCommand{
private org.order.dto.aggredto.AutoConfirmTimeDto AutoConfirmTimeDto;
}
