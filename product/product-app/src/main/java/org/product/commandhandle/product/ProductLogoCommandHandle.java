package  org.product.commandhandle.product;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.ProductLogoEvent;
import org.product.executor.command.aggre.product.ProductLogoCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductLogoCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (ProductLogoCommand command){
cacheService.update(new UpdateCache(command.getProductLogoDto(),repository));
AggregateLifecycle.apply(new ProductLogoEvent(command.getProductLogoDto()));
}}
