package  org.activite.executor.command.aggregation.redpacket;

import lombok.Value;
import org.activite.dto.agg.redpacket.RedPacketCountDto;
@Value
public class RedPacketCountCommand  extends AbstractRedPacketCommand {
private RedPacketCountDto  RedPacketCountDto;
}
