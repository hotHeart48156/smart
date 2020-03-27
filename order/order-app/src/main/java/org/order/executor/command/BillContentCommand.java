package org.order.executor.command;

import lombok.Value;
import org.order.dto.aggredto.BillContentDto;

@Value
public class BillContentCommand  extends AbstractCommand{
private BillContentDto  BillContentDto;
}
