package  org.activite.executor.command.aggregation.marketing;

import lombok.Value;
import org.activite.dto.agg.marketing.MarketStatusDto;
@Value
public class MarketStatusCommand  extends AbstractMarketingCommand {
private MarketStatusDto  MarketStatusDto;
}
