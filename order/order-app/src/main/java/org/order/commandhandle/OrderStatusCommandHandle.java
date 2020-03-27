package  org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.OrderStatusEvent;
import org.order.executor.command.OrderStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class OrderStatusCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (OrderStatusCommand command){
cacheService.update(new UpdateCache(command.getOrderStatusDto(),repository));
AggregateLifecycle.apply(new OrderStatusEvent(command.getOrderStatusDto()));
}}
