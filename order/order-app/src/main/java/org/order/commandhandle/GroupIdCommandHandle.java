package  org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.GroupIdEvent;
import org.order.executor.command.GroupIdCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class GroupIdCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (GroupIdCommand command){
cacheService.update(new UpdateCache(command.getGroupIdDto(),repository));
AggregateLifecycle.apply(new GroupIdEvent(command.getGroupIdDto()));
}}
