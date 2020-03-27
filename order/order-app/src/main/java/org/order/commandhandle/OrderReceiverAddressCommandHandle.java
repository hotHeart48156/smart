package  org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.OrderReceiverAddressEvent;
import org.order.executor.command.OrderReceiverAddressCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class OrderReceiverAddressCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (OrderReceiverAddressCommand command){
cacheService.update(new UpdateCache(command.getOrderReceiverAddressDto(),repository));
AggregateLifecycle.apply(new OrderReceiverAddressEvent(command.getOrderReceiverAddressDto()));
}}
