package  org.product.commandhandle.entity;
import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.ProductConsultRepository;
import org.product.event.ProductConsultEvent;
import org.product.executor.command.entity.ProductConsultCommand;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;
@Value


@Component
public class ProductConsultCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductConsultRepository repository;
@CommandHandler
public void on (ProductConsultCommand command){
cacheService.update(new UpdateCache(command.getProductConsultDto(),repository));
AggregateLifecycle.apply(new ProductConsultEvent(command.getProductConsultDto()));
}}
