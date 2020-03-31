package  org.activite.executor.command.aggregation.marketing;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.agg.marketing.MarketStatusDto;
@Value
@AllArgsConstructor

public class MarketStatusCommand  extends AbstractMarketingCommand {
private MarketStatusDto  MarketStatusDto;
}
