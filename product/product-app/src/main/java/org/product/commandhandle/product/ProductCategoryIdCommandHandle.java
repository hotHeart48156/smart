package  org.product.commandhandle.product;import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.ProductCategoryIdEvent;
import org.product.executor.command.aggre.product.ProductCategoryIdCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductCategoryIdCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (ProductCategoryIdCommand command){
cacheService.update(new UpdateCache(command.getProductCategoryIdDto(),repository));
AggregateLifecycle.apply(new ProductCategoryIdEvent(command.getProductCategoryIdDto()));
}}
