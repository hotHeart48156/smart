package  org.users.executor.command.entity;

import lombok.Value;
import org.users.executor.AbstractCommand;
@Value
public class IntegrationConsumeSettingCommand  extends AbstractCommand {
private org.users.dto.entity.IntegrationConsumeSettingDto IntegrationConsumeSettingDto;
}
