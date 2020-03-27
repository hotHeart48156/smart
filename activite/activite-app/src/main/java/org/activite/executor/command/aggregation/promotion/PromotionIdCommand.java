package  org.activite.executor.command.aggregation.promotion;

import lombok.Value;
import org.activite.dto.agg.promotion.PromotionIdDto;
@Value
public class PromotionIdCommand  extends AbstractPromotionCommand {
private PromotionIdDto  PromotionIdDto;
}
