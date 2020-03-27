package  org.product.commandhandle.product;import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.TitleEvent;
import org.product.executor.command.aggre.product.TitleCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class TitleCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (TitleCommand command){
cacheService.update(new UpdateCache(command.getTitleDto(),repository));
AggregateLifecycle.apply(new TitleEvent(command.getTitleDto()));
}}
