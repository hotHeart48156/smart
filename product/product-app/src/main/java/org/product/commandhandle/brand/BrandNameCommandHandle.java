package  org.product.commandhandle.brand;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.aggregation.BrandRepository;
import org.product.event.BrandNameEvent;
import org.product.executor.command.aggre.brand.BrandNameCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Value
@Component
public class BrandNameCommandHandle{
 @Autowired
private CacheService cacheService;
@Autowired
private BrandRepository repository;
@CommandHandler
public void on (BrandNameCommand command){
cacheService.update(new UpdateCache(command.getBrandNameDto(),repository));
AggregateLifecycle.apply(new BrandNameEvent(command.getBrandNameDto()));
}}
