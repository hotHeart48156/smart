package  org.users.executor.command.aggre;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.executor.AbstractCommand;
@Value
@EqualsAndHashCode(callSuper = false)

public class NickNameCommand  extends AbstractCommand {
private org.users.dto.agg.NickNameDto NickNameDto;
}
