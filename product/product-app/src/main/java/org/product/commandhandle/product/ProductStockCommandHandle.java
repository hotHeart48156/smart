package  org.product.commandhandle.product;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.ProductStockEvent;
import org.product.executor.command.aggre.product.ProductStockCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductStockCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (ProductStockCommand command){
cacheService.update(new UpdateCache(command.getProductStockDto(),repository));
AggregateLifecycle.apply(new ProductStockEvent(command.getProductStockDto()));
}}
