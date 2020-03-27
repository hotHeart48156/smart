package  org.product.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.ProductSkuStockRepository;
import org.product.event.ProductSkuStockEvent;
import org.product.executor.command.entity.ProductSkuStockCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductSkuStockCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductSkuStockRepository repository;
@CommandHandler
public void on (ProductSkuStockCommand command){
cacheService.update(new UpdateCache(command.getProductSkuStockDto(),repository));
AggregateLifecycle.apply(new ProductSkuStockEvent(command.getProductSkuStockDto()));
}}
