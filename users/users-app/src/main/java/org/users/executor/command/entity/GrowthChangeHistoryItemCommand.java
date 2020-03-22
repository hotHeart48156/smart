package  org.users.executor.command.entity;
import lombok.Value;
import org.users.dto.entity.GrowthChangeHistoryItemDto;
import org.users.executor.AbstractCommand;
@Value
public class GrowthChangeHistoryItemCommand  extends AbstractCommand {
private GrowthChangeHistoryItemDto  GrowthChangeHistoryItemDto;


}
