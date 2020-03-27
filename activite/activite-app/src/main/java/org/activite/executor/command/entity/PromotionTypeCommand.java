package  org.activite.executor.command.entity;

import lombok.Value;
import org.activite.dto.entity.PromotionTypeDto;
@Value
public class PromotionTypeCommand  extends AbstractEntityCommand{
private PromotionTypeDto  PromotionTypeDto;
}
