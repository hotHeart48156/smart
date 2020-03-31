package  org.activite.executor.command.entity;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.entity.GiftDto;
@Value
@AllArgsConstructor
public class GiftCommand  extends AbstractEntityCommand{
private GiftDto  GiftDto;
}
