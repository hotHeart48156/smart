package  org.activite.executor.command.aggregation.redpacket;

import lombok.Value;
import org.activite.dto.agg.redpacket.RedPacketStatusDto;
@Value
public class RedPacketStatusCommand  extends AbstractRedPacketCommand {
private RedPacketStatusDto  RedPacketStatusDto;
}
