package org.order.executor.command;

import lombok.Value;
@Value
public class AddBillMessageCommand  extends AbstractCommand{
private org.order.dto.aggredto.AddBillMessageDto AddBillMessageDto;
}
