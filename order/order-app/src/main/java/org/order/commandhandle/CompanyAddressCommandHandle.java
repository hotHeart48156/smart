package  org.order.commandhandle;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.CompanyAddressEvent;
import org.order.executor.command.CompanyAddressCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class CompanyAddressCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (CompanyAddressCommand command){
cacheService.update(new UpdateCache(command.getCompanyAddressDto(),repository));
AggregateLifecycle.apply(new CompanyAddressEvent(command.getCompanyAddressDto()));
}}
