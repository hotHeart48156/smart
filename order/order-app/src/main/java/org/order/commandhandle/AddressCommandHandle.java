package  org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.AddressEvent;
import org.order.executor.command.AddressCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class AddressCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (AddressCommand command){
cacheService.update(new UpdateCache(command.getAddressDto(),repository));
AggregateLifecycle.apply(new AddressEvent(command.getAddressDto()));
}}
