package  org.activite.executor.command.aggregation.redpacket;

import lombok.Value;
import org.activite.dto.agg.redpacket.NoteDto;
@Value
public class NoteCommand  extends AbstractRedPacketCommand {
private NoteDto  NoteDto;
}
