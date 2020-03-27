package  org.product.commandhandle.product;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.UsePointLimitEvent;
import org.product.executor.command.aggre.product.UsePointLimitCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class UsePointLimitCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (UsePointLimitCommand command){
cacheService.update(new UpdateCache(command.getUsePointLimitDto(),repository));
AggregateLifecycle.apply(new UsePointLimitEvent(command.getUsePointLimitDto()));
}}
