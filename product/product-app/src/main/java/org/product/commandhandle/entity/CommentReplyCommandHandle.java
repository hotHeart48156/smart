package  org.product.commandhandle.entity;
import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.CommentReplyRepository;
import org.product.event.CommentReplyEvent;
import org.product.executor.command.entity.CommentReplyCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class CommentReplyCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  CommentReplyRepository repository;
@CommandHandler
public void on (CommentReplyCommand command){
cacheService.update(new UpdateCache(command.getCommentReplyDto(),repository));
AggregateLifecycle.apply(new CommentReplyEvent(command.getCommentReplyDto()));
}}
