package  org.order.commandhandle;import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.IntegrationEvent;
import org.order.executor.command.IntegrationCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class IntegrationCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (IntegrationCommand command){
cacheService.update(new UpdateCache(command.getIntegrationDto(),repository));
AggregateLifecycle.apply(new IntegrationEvent(command.getIntegrationDto()));
}}
