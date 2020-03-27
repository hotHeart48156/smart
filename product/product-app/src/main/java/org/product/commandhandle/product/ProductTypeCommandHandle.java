package  org.product.commandhandle.product;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.ProductTypeEvent;
import org.product.executor.command.aggre.product.ProductTypeCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductTypeCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (ProductTypeCommand command){
cacheService.update(new UpdateCache(command.getProductTypeDto(),repository));
AggregateLifecycle.apply(new ProductTypeEvent(command.getProductTypeDto()));
}}
