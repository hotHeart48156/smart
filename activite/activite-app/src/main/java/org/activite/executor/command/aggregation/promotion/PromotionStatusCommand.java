package  org.activite.executor.command.aggregation.promotion;

import lombok.Value;

@Value
public class PromotionStatusCommand  extends AbstractPromotionCommand {
private org.activite.dto.agg.promotion.PromotionStatusDto PromotionStatusDto;
}
