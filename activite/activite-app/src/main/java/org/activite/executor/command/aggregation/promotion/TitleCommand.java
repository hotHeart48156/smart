package  org.activite.executor.command.aggregation.promotion;

import lombok.Value;

@Value
public class TitleCommand  extends AbstractPromotionCommand {
private org.activite.dto.agg.promotion.TitleDto TitleDto;
}
