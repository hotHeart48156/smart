package  org.activite.executor.command.entity;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.entity.HomeAdvertiseDto;
@Value
@AllArgsConstructor

public class HomeAdvertiseCommand  extends AbstractEntityCommand{
private HomeAdvertiseDto  HomeAdvertiseDto;
}
