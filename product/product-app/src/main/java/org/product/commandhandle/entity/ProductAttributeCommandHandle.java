package  org.product.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.ProductAttributeRepository;
import org.product.event.ProductAttributeEvent;
import org.product.executor.command.entity.ProductAttributeCommand;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;
@Value


@Component
public class ProductAttributeCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductAttributeRepository repository;
@CommandHandler
public void on (ProductAttributeCommand command){
cacheService.update(new UpdateCache(command.getProductAttributeDto(),repository));
AggregateLifecycle.apply(new ProductAttributeEvent(command.getProductAttributeDto()));
}}
