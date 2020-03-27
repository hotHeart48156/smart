package  org.product.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.CommentAndProductRelationshipRepository;
import org.product.event.CommentAndProductRelationshipEvent;
import org.product.executor.command.entity.CommentAndProductRelationshipCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class CommentAndProductRelationshipCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  CommentAndProductRelationshipRepository repository;
@CommandHandler
public void on (CommentAndProductRelationshipCommand command){
cacheService.update(new UpdateCache(command.getCommentAndProductRelationshipDto(),repository));
AggregateLifecycle.apply(new CommentAndProductRelationshipEvent(command.getCommentAndProductRelationshipDto()));
}}
