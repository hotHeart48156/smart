package  org.activite.executor.command.aggregation.redpacket;

import lombok.Value;
import org.activite.dto.agg.redpacket.SendTimeDto;
@Value
public class SendTimeCommand  extends AbstractRedPacketCommand {
private SendTimeDto  SendTimeDto;
}
