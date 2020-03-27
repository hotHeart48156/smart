package org.order.executor.command;

import lombok.Value;

@Value
public class BillTypeCommand  extends AbstractCommand{
private org.order.dto.aggredto.BillTypeDto BillTypeDto;
}
