package  org.order.commandhandle;import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.OrderReturnApplyEvent;
import org.order.executor.command.OrderReturnApplyCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class OrderReturnApplyCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (OrderReturnApplyCommand command){
cacheService.update(new UpdateCache(command.getOrderReturnApplyDto(),repository));
AggregateLifecycle.apply(new OrderReturnApplyEvent(command.getOrderReturnApplyDto()));
}}
