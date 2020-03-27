package  org.product.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.AddressRepository;
import org.product.event.AddressEvent;
import org.product.executor.command.entity.AddressCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class AddressCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  AddressRepository repository;
@CommandHandler
public void on (AddressCommand command){
cacheService.update(new UpdateCache(command.getAddressDto(),repository));
AggregateLifecycle.apply(new AddressEvent(command.getAddressDto()));
}}
