package  org.activite.executor.command.entity;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.entity.GroupMemberDto;
@Value
@AllArgsConstructor

public class GroupMemberCommand  extends AbstractEntityCommand{
private GroupMemberDto  GroupMemberDto;
}
