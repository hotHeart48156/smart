package  org.activite.executor.command.aggregation.redpacket;

import lombok.Value;
import org.activite.dto.agg.redpacket.RedPacketAmountDto;
@Value
public class RedPacketAmountCommand  extends AbstractRedPacketCommand {
private RedPacketAmountDto  RedPacketAmountDto;
}
