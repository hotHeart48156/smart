package  org.users.executor.command.entity;

import lombok.Value;

import org.users.executor.AbstractCommand;
@Value
public class TagCommand  extends AbstractCommand {
private org.users.dto.entity.TagDto TagDto;
}
