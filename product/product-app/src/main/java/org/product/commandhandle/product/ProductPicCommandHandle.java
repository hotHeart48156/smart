package  org.product.commandhandle.product;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.ProductPicEvent;
import org.product.executor.command.aggre.product.ProductPicCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductPicCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (ProductPicCommand command){
cacheService.update(new UpdateCache(command.getProductPicDto(),repository));
AggregateLifecycle.apply(new ProductPicEvent(command.getProductPicDto()));
}}
