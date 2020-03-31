package  org.activite.executor.command.aggregation.marketing;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.agg.marketing.SmallTypeDto;
@Value
@AllArgsConstructor

public class SmallTypeCommand  extends AbstractMarketingCommand {
private SmallTypeDto  SmallTypeDto;
}
