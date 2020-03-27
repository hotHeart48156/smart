package  org.product.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.ProductVerifyRecordRepository;
import org.product.event.ProductVerifyRecordEvent;
import org.product.executor.command.entity.ProductVerifyRecordCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductVerifyRecordCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductVerifyRecordRepository repository;
@CommandHandler
public void on (ProductVerifyRecordCommand command){
cacheService.update(new UpdateCache(command.getProductVerifyRecordDto(),repository));
AggregateLifecycle.apply(new ProductVerifyRecordEvent(command.getProductVerifyRecordDto()));
}}
