package  org.product.commandhandle.entity;
import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.ProductOperateLogRepository;
import org.product.event.ProductOperateLogEvent;
import org.product.executor.command.entity.ProductOperateLogCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Value


@Component
public class ProductOperateLogCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductOperateLogRepository repository;
@CommandHandler
public void on (ProductOperateLogCommand command){
cacheService.update(new UpdateCache(command.getProductOperateLogDto(),repository));
AggregateLifecycle.apply(new ProductOperateLogEvent(command.getProductOperateLogDto()));
}}
