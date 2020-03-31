package  org.activite.executor.command.aggregation.marketing;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.agg.marketing.DiscountTypeDto;
@Value
@AllArgsConstructor

public class DiscountTypeCommand  extends AbstractMarketingCommand {
private DiscountTypeDto  DiscountTypeDto;
}
