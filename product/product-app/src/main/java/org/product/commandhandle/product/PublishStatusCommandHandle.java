package  org.product.commandhandle.product;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.PublishStatusEvent;
import org.product.executor.command.aggre.product.PublishStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class PublishStatusCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (PublishStatusCommand command){
cacheService.update(new UpdateCache(command.getPublishStatusDto(),repository));
AggregateLifecycle.apply(new PublishStatusEvent(command.getPublishStatusDto()));
}}