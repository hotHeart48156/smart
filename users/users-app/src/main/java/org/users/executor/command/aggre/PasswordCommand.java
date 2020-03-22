package  org.users.executor.command.aggre;

import lombok.Value;

import org.users.executor.AbstractCommand;
@Value
public class PasswordCommand  extends AbstractCommand {
private org.users.dto.agg.PasswordDto PasswordDto;
}
