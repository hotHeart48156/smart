package  org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.PaymentTimeEvent;
import org.order.executor.command.PaymentTimeCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class PaymentTimeCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (PaymentTimeCommand command){
cacheService.update(new UpdateCache(command.getPaymentTimeDto(),repository));
AggregateLifecycle.apply(new PaymentTimeEvent(command.getPaymentTimeDto()));
}}
