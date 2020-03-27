package org.activite.commandhandle.entity;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.PromotionTypeRepository;
import org.activite.event.PromotionTypeEvent;
import org.activite.executor.command.entity.PromotionTypeCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class PromotionTypeCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  PromotionTypeRepository repository;
@CommandHandler
public void on (PromotionTypeCommand command){
cacheService.update(new UpdateCache(command.getPromotionTypeDto(),repository));
AggregateLifecycle.apply(new PromotionTypeEvent(command.getPromotionTypeDto()));
}}
