package  org.order.commandhandle;import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.DeliveryTimeEvent;
import org.order.executor.command.DeliveryTimeCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class DeliveryTimeCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (DeliveryTimeCommand command){
cacheService.update(new UpdateCache(command.getDeliveryTimeDto(),repository));
AggregateLifecycle.apply(new DeliveryTimeEvent(command.getDeliveryTimeDto()));
}}
