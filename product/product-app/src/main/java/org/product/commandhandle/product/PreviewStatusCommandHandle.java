package  org.product.commandhandle.product;import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.PreviewStatusEvent;
import org.product.executor.command.aggre.product.PreviewStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Component;
@Value
@Component
public class PreviewStatusCommandHandle extends AbstractProductCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (PreviewStatusCommand command){
cacheService.update(new UpdateCache(command.getPreviewStatusDto(),repository));
AggregateLifecycle.apply(new PreviewStatusEvent(command.getPreviewStatusDto()));
}}
