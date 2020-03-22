package  org.users.executor.command.entity;
import lombok.Value;
import org.users.executor.AbstractCommand;
@Value
public class MemberLevelCommand  extends AbstractCommand {
private MemberLevelDto  MemberLevelDto;
}
