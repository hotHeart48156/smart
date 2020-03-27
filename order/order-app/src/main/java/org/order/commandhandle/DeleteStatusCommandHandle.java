package  org.order.commandhandle;import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.DeleteStatusEvent;
import org.order.executor.command.DeleteStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class DeleteStatusCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (DeleteStatusCommand command){
cacheService.update(new UpdateCache(command.getDeleteStatusDto(),repository));
AggregateLifecycle.apply(new DeleteStatusEvent(command.getDeleteStatusDto()));
}}
