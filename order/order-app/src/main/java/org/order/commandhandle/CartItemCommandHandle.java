package  org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.CartItemEvent;
import org.order.executor.command.CartItemCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class CartItemCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (CartItemCommand command){
cacheService.update(new UpdateCache(command.getCartItemDto(),repository));
AggregateLifecycle.apply(new CartItemEvent(command.getCartItemDto()));
}}
