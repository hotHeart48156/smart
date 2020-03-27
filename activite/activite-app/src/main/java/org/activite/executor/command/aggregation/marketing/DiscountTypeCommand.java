package  org.activite.executor.command.aggregation.marketing;

import lombok.Value;
import org.activite.dto.agg.marketing.DiscountTypeDto;
@Value
public class DiscountTypeCommand  extends AbstractMarketingCommand {
private DiscountTypeDto  DiscountTypeDto;
}
