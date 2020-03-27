package  org.product.commandhandle.product;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.ProductPriceEvent;
import org.product.executor.command.aggre.product.ProductPriceCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductPriceCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (ProductPriceCommand command){
cacheService.update(new UpdateCache(command.getProductPriceDto(),repository));
AggregateLifecycle.apply(new ProductPriceEvent(command.getProductPriceDto()));
}}
