package  org.product.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.ProductAttributeValueRepository;
import org.product.event.ProductAttributeValueEvent;
import org.product.executor.command.entity.ProductAttributeValueCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductAttributeValueCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductAttributeValueRepository repository;
@CommandHandler
public void on (ProductAttributeValueCommand command){
cacheService.update(new UpdateCache(command.getProductAttributeValueDto(),repository));
AggregateLifecycle.apply(new ProductAttributeValueEvent(command.getProductAttributeValueDto()));
}}
