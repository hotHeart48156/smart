package  org.users.executor.command.aggre;

import lombok.Value;

import org.users.executor.AbstractCommand;
@Value
public class GenderCommand  extends AbstractCommand {
private org.users.dto.agg.GenderDto GenderDto;
}
