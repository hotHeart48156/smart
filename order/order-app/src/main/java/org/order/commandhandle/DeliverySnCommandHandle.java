package  org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.DeliverySnEvent;
import org.order.executor.command.DeliverySnCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class DeliverySnCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (DeliverySnCommand command){
cacheService.update(new UpdateCache(command.getDeliverySnDto(),repository));
AggregateLifecycle.apply(new DeliverySnEvent(command.getDeliverySnDto()));
}}
