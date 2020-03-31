package  org.activite.executor.command.aggregation.marketing;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.agg.marketing.UserLevelDto;
@Value
@AllArgsConstructor

public class UserLevelCommand  extends AbstractMarketingCommand {
private UserLevelDto  UserLevelDto;
}
