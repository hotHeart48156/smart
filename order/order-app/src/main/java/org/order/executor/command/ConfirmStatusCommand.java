package org.order.executor.command;

import lombok.Value;

@Value
public class ConfirmStatusCommand  extends AbstractCommand{
private org.order.dto.aggredto.ConfirmStatusDto ConfirmStatusDto;
}
