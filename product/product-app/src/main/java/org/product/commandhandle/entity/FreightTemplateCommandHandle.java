package  org.product.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.FreightTemplateRepository;
import org.product.event.FreightTemplateEvent;
import org.product.executor.command.entity.FreightTemplateCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Value


@Component
public class FreightTemplateCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  FreightTemplateRepository repository;
@CommandHandler
public void on (FreightTemplateCommand command){
cacheService.update(new UpdateCache(command.getFreightTemplateDto(),repository));
AggregateLifecycle.apply(new FreightTemplateEvent(command.getFreightTemplateDto()));
}}
