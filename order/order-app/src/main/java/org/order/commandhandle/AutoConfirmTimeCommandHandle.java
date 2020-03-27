package  org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.AutoConfirmTimeEvent;
import org.order.executor.command.AutoConfirmTimeCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class AutoConfirmTimeCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (AutoConfirmTimeCommand command){
cacheService.update(new UpdateCache(command.getAutoConfirmTimeDto(),repository));
AggregateLifecycle.apply(new AutoConfirmTimeEvent(command.getAutoConfirmTimeDto()));
}}
