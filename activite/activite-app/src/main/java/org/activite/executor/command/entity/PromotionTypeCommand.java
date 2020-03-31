package  org.activite.executor.command.entity;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.entity.PromotionTypeDto;
@Value
@AllArgsConstructor

public class PromotionTypeCommand  extends AbstractEntityCommand{
private PromotionTypeDto  PromotionTypeDto;
}
