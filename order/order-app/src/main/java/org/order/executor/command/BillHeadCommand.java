package org.order.executor.command;

import lombok.Value;
@Value
public class BillHeadCommand  extends AbstractCommand{
private org.order.dto.aggredto.BillHeadDto BillHeadDto;
}
