package  org.activite.executor.command.aggregation.redpacket;

import lombok.Value;
import org.activite.dto.agg.redpacket.UserIdDto;
@Value
public class UserIdCommand  extends AbstractRedPacketCommand {
private UserIdDto  UserIdDto;
}
