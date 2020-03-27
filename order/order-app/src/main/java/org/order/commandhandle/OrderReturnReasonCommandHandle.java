package  org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.OrderReturnReasonEvent;
import org.order.executor.command.OrderReturnReasonCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class OrderReturnReasonCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (OrderReturnReasonCommand command){
cacheService.update(new UpdateCache(command.getOrderReturnReasonDto(),repository));
AggregateLifecycle.apply(new OrderReturnReasonEvent(command.getOrderReturnReasonDto()));
}}
