package  org.product.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.GiftsCategoryRepository;
import org.product.event.GiftsCategoryEvent;
import org.product.executor.command.entity.GiftsCategoryCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class GiftsCategoryCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private GiftsCategoryRepository repository;
@CommandHandler
public void on (GiftsCategoryCommand command){
cacheService.update(new UpdateCache(command.getGiftsCategoryDto(),repository));
AggregateLifecycle.apply(new GiftsCategoryEvent(command.getGiftsCategoryDto()));
}}
