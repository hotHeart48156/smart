package  org.order.commandhandle;import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.OrderDeleteStatusEvent;
import org.order.executor.command.OrderDeleteStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class OrderDeleteStatusCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (OrderDeleteStatusCommand command){
cacheService.update(new UpdateCache(command.getOrderDeleteStatusDto(),repository));
AggregateLifecycle.apply(new OrderDeleteStatusEvent(command.getOrderDeleteStatusDto()));
}}
