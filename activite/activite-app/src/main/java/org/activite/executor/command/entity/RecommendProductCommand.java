package  org.activite.executor.command.entity;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.entity.RecommendProductDto;
@Value
@AllArgsConstructor

public class RecommendProductCommand  extends AbstractEntityCommand{
private RecommendProductDto  RecommendProductDto;
}
