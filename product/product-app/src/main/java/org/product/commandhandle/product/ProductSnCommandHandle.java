package  org.product.commandhandle.product;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.ProductSnEvent;
import org.product.executor.command.aggre.product.ProductSnCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductSnCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (ProductSnCommand command){
cacheService.update(new UpdateCache(command.getProductSnDto(),repository));
AggregateLifecycle.apply(new ProductSnEvent(command.getProductSnDto()));
}}
