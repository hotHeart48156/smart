package  org.activite.executor.command.aggregation.marketing;

import lombok.Value;
import org.activite.dto.agg.marketing.ActivityUserDto;
@Value
public class ActivityUserCommand  extends AbstractMarketingCommand {
private ActivityUserDto  ActivityUserDto;
}
