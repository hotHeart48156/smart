package  org.activite.executor.command.entity;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.entity.HomeBrandDto;
@Value
@AllArgsConstructor

public class HomeBrandCommand  extends AbstractEntityCommand{
private HomeBrandDto  HomeBrandDto;
}
