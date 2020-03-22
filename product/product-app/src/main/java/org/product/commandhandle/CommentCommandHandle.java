package  org.product.commandhandle;
import lombok.Value;
@Value
public class CommentCommandHandle{
@CommandHandler
public void on (CommentCommand Command){
AggregateLifecycle.apply(new CommentEvent(Command.getCommentDto()));
}}
