package  org.product.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.GiftAndProductRelationshipRepository;
import org.product.event.GiftAndProductRelationshipEvent;
import org.product.executor.command.entity.GiftAndProductRelationshipCommand;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;
@Value


@Component
public class GiftAndProductRelationshipCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  GiftAndProductRelationshipRepository repository;
@CommandHandler
public void on (GiftAndProductRelationshipCommand command){
cacheService.update(new UpdateCache(command.getGiftAndProductRelationshipDto(),repository));
AggregateLifecycle.apply(new GiftAndProductRelationshipEvent(command.getGiftAndProductRelationshipDto()));
}}
