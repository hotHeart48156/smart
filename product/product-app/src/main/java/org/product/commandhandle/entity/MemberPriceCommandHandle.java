package  org.product.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.MemberPriceRepository;
import org.product.event.MemberPriceEvent;
import org.product.executor.command.entity.MemberPriceCommand;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;


@Component
public class MemberPriceCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  MemberPriceRepository repository;
@CommandHandler
public void on (MemberPriceCommand command){
cacheService.update(new UpdateCache(command.getMemberPriceDto(),repository));
AggregateLifecycle.apply(new MemberPriceEvent(command.getMemberPriceDto()));
}}
