package  org.order.commandhandle;
import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.DeliveryCompanyNameEvent;
import org.order.executor.command.DeliveryCompanyNameCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class DeliveryCompanyNameCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (DeliveryCompanyNameCommand command){
cacheService.update(new UpdateCache(command.getDeliveryCompanyNameDto(),repository));
AggregateLifecycle.apply(new DeliveryCompanyNameEvent(command.getDeliveryCompanyNameDto()));
}}
