package  org.order.commandhandle;import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.AddBillMessageEvent;
import org.order.executor.command.AddBillMessageCommand;
import org.springframework.beans.factory.annotation.Autowired;



@Value
public class AddBillMessageCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (AddBillMessageCommand command){
cacheService.update(new UpdateCache(command.getAddBillMessageDto(),repository));
AggregateLifecycle.apply(new AddBillMessageEvent(command.getAddBillMessageDto()));
}}
