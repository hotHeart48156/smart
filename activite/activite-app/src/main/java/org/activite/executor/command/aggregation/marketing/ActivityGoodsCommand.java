package  org.activite.executor.command.aggregation.marketing;

import lombok.Value;
import org.activite.dto.agg.marketing.ActivityGoodsDto;
@Value
public class ActivityGoodsCommand  extends AbstractMarketingCommand {
private ActivityGoodsDto  ActivityGoodsDto;
}
