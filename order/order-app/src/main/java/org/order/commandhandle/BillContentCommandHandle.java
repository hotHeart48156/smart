package  org.order.commandhandle;import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.BillContentEvent;
import org.order.executor.command.BillContentCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class BillContentCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (BillContentCommand command){
cacheService.update(new UpdateCache(command.getBillContentDto(),repository));
AggregateLifecycle.apply(new BillContentEvent(command.getBillContentDto()));
}}
