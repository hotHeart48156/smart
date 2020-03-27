package  org.product.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.ProductCategoryRepository;
import org.product.event.ProductCategoryEvent;
import org.product.executor.command.entity.ProductCategoryCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductCategoryCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductCategoryRepository repository;
@CommandHandler
public void on (ProductCategoryCommand command){
cacheService.update(new UpdateCache(command.getProductCategoryDto(),repository));
AggregateLifecycle.apply(new ProductCategoryEvent(command.getProductCategoryDto()));
}}
