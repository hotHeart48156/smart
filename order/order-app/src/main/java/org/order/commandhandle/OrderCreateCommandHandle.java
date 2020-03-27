package  org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.OrderCreateEvent;
import org.order.executor.command.OrderCreateCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class OrderCreateCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (OrderCreateCommand command){
cacheService.update(new UpdateCache(command.getOrderCreateDto(),repository));
AggregateLifecycle.apply(new OrderCreateEvent(command.getOrderCreateDto()));
}}
