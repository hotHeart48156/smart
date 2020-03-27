package  org.activite.executor.command.aggregation.redpacket;

import lombok.Value;
import org.activite.dto.agg.redpacket.RedPacketIdDto;
@Value
public class RedPacketIdCommand  extends AbstractRedPacketCommand {
private RedPacketIdDto  RedPacketIdDto;
}
