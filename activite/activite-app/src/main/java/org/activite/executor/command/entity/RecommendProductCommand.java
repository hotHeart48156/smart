package  org.activite.executor.command.entity;

import lombok.Value;
import org.activite.dto.entity.RecommendProductDto;
@Value
public class RecommendProductCommand  extends AbstractEntityCommand{
private RecommendProductDto  RecommendProductDto;
}
