package  org.activite.executor.command.aggregation.redpacket;

import lombok.Value;
import org.activite.dto.agg.redpacket.SingleRedPacketAmountDto;
@Value
public class SingleRedPacketAmountCommand  extends AbstractRedPacketCommand {
private SingleRedPacketAmountDto  SingleRedPacketAmountDto;
}
