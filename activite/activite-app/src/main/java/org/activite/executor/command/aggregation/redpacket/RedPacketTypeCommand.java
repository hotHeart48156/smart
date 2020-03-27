package  org.activite.executor.command.aggregation.redpacket;

import lombok.Value;
import org.activite.dto.agg.redpacket.RedPacketTypeDto;
@Value
public class RedPacketTypeCommand  extends AbstractRedPacketCommand {
private RedPacketTypeDto  RedPacketTypeDto;
}
