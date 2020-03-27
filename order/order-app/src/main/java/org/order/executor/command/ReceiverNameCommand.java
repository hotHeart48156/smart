package org.order.executor.command;

import lombok.Value;

@Value
public class ReceiverNameCommand  extends AbstractCommand{
private org.order.dto.aggredto.ReceiverNameDto ReceiverNameDto;
}
