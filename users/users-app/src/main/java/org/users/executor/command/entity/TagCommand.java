package  org.users.executor.command.entity;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.executor.AbstractCommand;
@Value
@EqualsAndHashCode(callSuper = false)

public class TagCommand  extends AbstractCommand {
private org.users.dto.entity.TagDto TagDto;
}
