package  org.activite.executor.command.entity;

import lombok.Value;
import org.activite.dto.entity.GiftDto;
@Value
public class GiftCommand  extends AbstractEntityCommand{
private GiftDto  GiftDto;
}
