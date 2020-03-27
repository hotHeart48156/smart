package  org.product.commandhandle.product;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.ProductPromotionEndTimeEvent;
import org.product.executor.command.aggre.product.ProductPromotionEndTimeCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductPromotionEndTimeCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (ProductPromotionEndTimeCommand command){
cacheService.update(new UpdateCache(command.getProductPromotionEndTimeDto(),repository));
AggregateLifecycle.apply(new ProductPromotionEndTimeEvent(command.getProductPromotionEndTimeDto()));
}}
