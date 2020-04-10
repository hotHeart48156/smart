package  org.users.executor.command.entity;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.dto.entity.GrowthChangeHistoryItemDto;
import org.users.executor.AbstractCommand;
@Value
@EqualsAndHashCode(callSuper = false)

public class GrowthChangeHistoryItemCommand  extends AbstractCommand {
private GrowthChangeHistoryItemDto  GrowthChangeHistoryItemDto;


}
