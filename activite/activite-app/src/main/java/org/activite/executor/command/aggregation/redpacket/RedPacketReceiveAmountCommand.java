package  org.activite.executor.command.aggregation.redpacket;

import lombok.Value;
import org.activite.dto.agg.redpacket.RedPacketReceiveAmountDto;
@Value
public class RedPacketReceiveAmountCommand  extends AbstractRedPacketCommand {
private RedPacketReceiveAmountDto  RedPacketReceiveAmountDto;
}
