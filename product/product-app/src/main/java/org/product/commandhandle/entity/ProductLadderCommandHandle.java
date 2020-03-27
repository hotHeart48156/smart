package  org.product.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.ProductLadderRepository;
import org.product.event.ProductLadderEvent;
import org.product.executor.command.entity.ProductLadderCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductLadderCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductLadderRepository repository;
@CommandHandler
public void on (ProductLadderCommand command){
cacheService.update(new UpdateCache(command.getProductLadderDto(),repository));
AggregateLifecycle.apply(new ProductLadderEvent(command.getProductLadderDto()));
}}
