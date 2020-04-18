package  org.product.executor.command.entity;

import lombok.Value;
import org.product.executor.AbstractCommand;
import org.springframework.stereotype.Component;

@Value
@Component
public class CommentCommand  extends AbstractCommand {
private org.product.dto.entity.CommentDto CommentDto;
}
