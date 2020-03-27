package org.order.executor.command;

import lombok.Value;

@Value
public class DeleteStatusCommand  extends AbstractCommand{
private org.order.dto.aggredto.DeleteStatusDto DeleteStatusDto;
}
