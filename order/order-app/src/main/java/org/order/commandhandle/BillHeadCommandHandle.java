package  org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.BillHeadEvent;
import org.order.executor.command.BillHeadCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class BillHeadCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (BillHeadCommand command){
cacheService.update(new UpdateCache(command.getBillHeadDto(),repository));
AggregateLifecycle.apply(new BillHeadEvent(command.getBillHeadDto()));
}}
