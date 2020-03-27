package  org.product.commandhandle.entity;
import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.ProductAttributeCategoryRepository;
import org.product.event.ProductAttributeCategoryEvent;
import org.product.executor.command.entity.ProductAttributeCategoryCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductAttributeCategoryCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductAttributeCategoryRepository repository;
@CommandHandler
public void on (ProductAttributeCategoryCommand command){
cacheService.update(new UpdateCache(command.getProductAttributeCategoryDto(),repository));
AggregateLifecycle.apply(new ProductAttributeCategoryEvent(command.getProductAttributeCategoryDto()));
}}
