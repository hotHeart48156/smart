package  org.product.commandhandle.product;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.event.ProductSubtitleEvent;
import org.product.executor.command.aggre.product.ProductSubtitleCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class ProductSubtitleCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  ProductRepository repository;
@CommandHandler
public void on (ProductSubtitleCommand command){
cacheService.update(new UpdateCache(command.getProductSubtitleDto(),repository));
AggregateLifecycle.apply(new ProductSubtitleEvent(command.getProductSubtitleDto()));
}}
