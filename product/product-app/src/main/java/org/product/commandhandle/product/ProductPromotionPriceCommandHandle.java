package  org.product.commandhandle.product;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.ProductPromotionPriceEvent;
import org.product.executor.command.aggre.product.ProductPromotionPriceCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductPromotionPriceCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (ProductPromotionPriceCommand command){
cacheService.update(new UpdateCache(command.getProductPromotionPriceDto(),repository));
AggregateLifecycle.apply(new ProductPromotionPriceEvent(command.getProductPromotionPriceDto()));
}}
