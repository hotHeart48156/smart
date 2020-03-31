package  org.activite.executor.command.entity;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.entity.GroupDto;
@Value
@AllArgsConstructor

public class GroupCommand  extends AbstractEntityCommand{
private GroupDto  GroupDto;
}
