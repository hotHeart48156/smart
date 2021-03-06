package  org.product.commandhandle.product;
import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.DeleteStatusEvent;
import org.product.executor.command.aggre.product.DeleteStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Component;
@Value
@Component
public class DeleteStatusCommandHandle extends AbstractProductCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (DeleteStatusCommand command){
cacheService.update(new UpdateCache(command.getDeleteStatusDto(),repository));
AggregateLifecycle.apply(new DeleteStatusEvent(command.getDeleteStatusDto()));
}}
