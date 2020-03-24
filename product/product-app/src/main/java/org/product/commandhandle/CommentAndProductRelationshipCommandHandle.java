package  org.product.commandhandle;
import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.event.CommentAndProductRelationshipEvent;
import org.product.executor.command.entity.CommentAndProductRelationshipCommand;

@Value
public class CommentAndProductRelationshipCommandHandle{
@CommandHandler
public void on (CommentAndProductRelationshipCommand Command){
AggregateLifecycle.apply(new CommentAndProductRelationshipEvent(Command.getCommentAndProductRelationshipDto()));
}}
