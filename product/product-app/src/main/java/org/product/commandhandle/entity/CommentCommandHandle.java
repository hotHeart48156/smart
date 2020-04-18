package  org.product.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.CommentRepository;
import org.product.event.CommentEvent;
import org.product.executor.command.entity.CommentCommand;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;
@Value


@Component
public class CommentCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private CacheService cacheService;
@Autowired
private CommentRepository repository;
@CommandHandler
public void on (CommentCommand command){
cacheService.update(new UpdateCache(command.getCommentDto(),repository));
AggregateLifecycle.apply(new CommentEvent(command.getCommentDto()));
}}
