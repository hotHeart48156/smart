package  org.activite.executor.command.aggregation.marketing;

import lombok.Value;
import org.activite.dto.agg.marketing.UserLevelDto;
@Value
public class UserLevelCommand  extends AbstractMarketingCommand {
private UserLevelDto  UserLevelDto;
}
