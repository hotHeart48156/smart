package  org.activite.executor.command.aggregation.redpacket;

import lombok.Value;
import org.activite.dto.agg.redpacket.RedPacketStockDto;
@Value
public class RedPacketStockCommand  extends AbstractRedPacketCommand {
private RedPacketStockDto  RedPacketStockDto;
}
