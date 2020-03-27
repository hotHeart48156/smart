package  org.product.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.GiftsRepository;
import org.product.event.GiftsEvent;
import org.product.executor.command.entity.GiftsCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class GiftsCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  GiftsRepository repository;
@CommandHandler
public void on (GiftsCommand command){
cacheService.update(new UpdateCache(command.getGiftsDto(),repository));
AggregateLifecycle.apply(new GiftsEvent(command.getGiftsDto()));
}}
