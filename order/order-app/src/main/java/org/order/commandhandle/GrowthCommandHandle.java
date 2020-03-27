package  org.order.commandhandle;import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.GrowthEvent;
import org.order.executor.command.GrowthCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class GrowthCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (GrowthCommand command){
cacheService.update(new UpdateCache(command.getGrowthDto(),repository));
AggregateLifecycle.apply(new GrowthEvent(command.getGrowthDto()));
}}
