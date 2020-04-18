package  org.product.commandhandle.product;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.RecommandStatusEvent;
import org.product.executor.command.aggre.product.RecommandStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Component;
@Value
@Component
public class RecommandStatusCommandHandle extends AbstractProductCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (RecommandStatusCommand command){
cacheService.update(new UpdateCache(command.getRecommandStatusDto(),repository));
AggregateLifecycle.apply(new RecommandStatusEvent(command.getRecommandStatusDto()));
}}
