package  org.product.commandhandle.product;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.ProductCategoryNameEvent;
import org.product.executor.command.aggre.product.ProductCategoryNameCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductCategoryNameCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (ProductCategoryNameCommand command){
cacheService.update(new UpdateCache(command.getProductCategoryNameDto(),repository));
AggregateLifecycle.apply(new ProductCategoryNameEvent(command.getProductCategoryNameDto()));
}}
