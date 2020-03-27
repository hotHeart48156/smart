package  org.product.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.ProductFullReductionRepository;
import org.product.event.ProductFullReductionEvent;
import org.product.executor.command.entity.ProductFullReductionCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductFullReductionCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductFullReductionRepository repository;
@CommandHandler
public void on (ProductFullReductionCommand command){
cacheService.update(new UpdateCache(command.getProductFullReductionDto(),repository));
AggregateLifecycle.apply(new ProductFullReductionEvent(command.getProductFullReductionDto()));
}}
