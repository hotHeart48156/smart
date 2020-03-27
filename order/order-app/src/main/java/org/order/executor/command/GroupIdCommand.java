package org.order.executor.command;

import lombok.Value;
import org.order.dto.aggredto.GroupIdDto;

@Value
public class GroupIdCommand  extends AbstractCommand{
private GroupIdDto  GroupIdDto;
}
