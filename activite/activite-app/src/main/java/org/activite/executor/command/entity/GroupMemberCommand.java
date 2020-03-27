package  org.activite.executor.command.entity;

import lombok.Value;
import org.activite.dto.entity.GroupMemberDto;
@Value
public class GroupMemberCommand  extends AbstractEntityCommand{
private GroupMemberDto  GroupMemberDto;
}
