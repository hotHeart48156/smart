package org.activite.commandhandle.entity;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.GiftRepository;
import org.activite.event.GiftEvent;
import org.activite.executor.command.entity.GiftCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class GiftCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  GiftRepository repository;
@CommandHandler
public void on (GiftCommand command){
cacheService.update(new UpdateCache(command.getGiftDto(),repository));
AggregateLifecycle.apply(new GiftEvent(command.getGiftDto()));
}}
