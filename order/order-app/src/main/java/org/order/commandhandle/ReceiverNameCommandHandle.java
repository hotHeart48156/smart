package  org.order.commandhandle;import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.ReceiverNameEvent;
import org.order.executor.command.ReceiverNameCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ReceiverNameCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (ReceiverNameCommand command){
cacheService.update(new UpdateCache(command.getReceiverNameDto(),repository));
AggregateLifecycle.apply(new ReceiverNameEvent(command.getReceiverNameDto()));
}}
