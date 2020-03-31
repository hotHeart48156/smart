package  org.activite.executor.command.aggregation.marketing;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.agg.marketing.MarketingNameDto;
@Value
@AllArgsConstructor

public class MarketingNameCommand  extends AbstractMarketingCommand {
private MarketingNameDto  MarketingNameDto;
}
