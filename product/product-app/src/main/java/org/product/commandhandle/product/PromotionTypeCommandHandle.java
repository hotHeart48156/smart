package  org.product.commandhandle.product;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.PromotionTypeEvent;
import org.product.executor.command.aggre.product.PromotionTypeCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class PromotionTypeCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (PromotionTypeCommand command){
cacheService.update(new UpdateCache(command.getPromotionTypeDto(),repository));
AggregateLifecycle.apply(new PromotionTypeEvent(command.getPromotionTypeDto()));
}}
