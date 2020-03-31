package  org.activite.executor.command.entity;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.entity.PromotionLogDto;
@Value
@AllArgsConstructor

public class PromotionLogCommand  extends AbstractEntityCommand{
private PromotionLogDto  PromotionLogDto;
}
