package  org.users.executor.command.entity;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.executor.AbstractCommand;
@Value
@EqualsAndHashCode(callSuper = false)

public class UserIntegrationRuleCommand  extends AbstractCommand {
private org.users.dto.entity.UserIntegrationRuleDto UserIntegrationRuleDto;
}
