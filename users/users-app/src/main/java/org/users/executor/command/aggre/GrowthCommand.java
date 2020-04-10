package  org.users.executor.command.aggre;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.executor.AbstractCommand;
@Value
@EqualsAndHashCode(callSuper = false)

public class GrowthCommand  extends AbstractCommand {
private org.users.dto.agg.GrowthDto GrowthDto;
}
