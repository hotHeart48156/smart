package  org.product.executor.command.entity;

import lombok.Value;

import org.product.executor.AbstractCommand;
@Value
public class CommentReplyCommand  extends AbstractCommand{
private org.product.dto.entity.CommentReplyDto CommentReplyDto;
}
