package  org.activite.executor.command.entity;

import lombok.Value;
import org.activite.dto.entity.HomeNewProductDto;
@Value
public class HomeNewProductCommand  extends AbstractEntityCommand{
private HomeNewProductDto  HomeNewProductDto;
}
