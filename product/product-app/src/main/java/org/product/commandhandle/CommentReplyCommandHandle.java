package  org.product.commandhandle;
import lombok.Value;
@Value
public class CommentReplyCommandHandle{
@CommandHandler
public void on (CommentReplyCommand Command){
AggregateLifecycle.apply(new CommentReplyEvent(Command.getCommentReplyDto()));
}}
