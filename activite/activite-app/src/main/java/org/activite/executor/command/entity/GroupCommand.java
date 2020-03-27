package  org.activite.executor.command.entity;

import lombok.Value;
import org.activite.dto.entity.GroupDto;
@Value
public class GroupCommand  extends AbstractEntityCommand{
private GroupDto  GroupDto;
}
