package  org.users.executor.command.entity;

import lombok.Value;
import org.users.executor.AbstractCommand;
@Value
public class AppletSetCommand  extends AbstractCommand {
private org.users.dto.entity.AppletSetDto AppletSetDto;
}
