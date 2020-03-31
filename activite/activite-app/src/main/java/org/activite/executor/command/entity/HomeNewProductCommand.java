package  org.activite.executor.command.entity;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.entity.HomeNewProductDto;
@Value
@AllArgsConstructor

public class HomeNewProductCommand  extends AbstractEntityCommand{
private HomeNewProductDto  HomeNewProductDto;
}
