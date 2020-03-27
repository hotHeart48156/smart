package  org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.OrderItemEvent;
import org.order.executor.command.OrderItemCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class OrderItemCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (OrderItemCommand command){
cacheService.update(new UpdateCache(command.getOrderItemDto(),repository));
AggregateLifecycle.apply(new OrderItemEvent(command.getOrderItemDto()));
}}
