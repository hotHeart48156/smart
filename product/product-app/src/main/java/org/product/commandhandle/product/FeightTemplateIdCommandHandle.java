package  org.product.commandhandle.product;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.FeightTemplateIdEvent;
import org.product.executor.command.aggre.product.FeightTemplateIdCommand;
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Component;
@Value
@Component
public class FeightTemplateIdCommandHandle extends AbstractProductCommandHandle{
 @Autowired
private CacheService cacheService;
@Autowired
private ProductRepository repository;
@CommandHandler
public void on (FeightTemplateIdCommand command){
cacheService.update(new UpdateCache(command.getFeightTemplateIdDto(),repository));
AggregateLifecycle.apply(new FeightTemplateIdEvent(command.getFeightTemplateIdDto()));
}}
