package  org.users.executor.command.aggre;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.executor.AbstractCommand;
@Value
@EqualsAndHashCode(callSuper = false)

public class UserIconCommand  extends AbstractCommand {
private org.users.dto.agg.UserIconDto UserIconDto;
}
