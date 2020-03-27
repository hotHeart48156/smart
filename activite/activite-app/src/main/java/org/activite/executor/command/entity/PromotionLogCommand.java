package  org.activite.executor.command.entity;

import lombok.Value;
import org.activite.dto.entity.PromotionLogDto;
@Value
public class PromotionLogCommand  extends AbstractEntityCommand{
private PromotionLogDto  PromotionLogDto;
}
