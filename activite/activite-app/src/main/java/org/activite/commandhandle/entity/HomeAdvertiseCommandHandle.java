package org.activite.commandhandle.entity;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.HomeAdvertiseRepository;
import org.activite.event.HomeAdvertiseEvent;
import org.activite.executor.command.entity.HomeAdvertiseCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class HomeAdvertiseCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  HomeAdvertiseRepository repository;
@CommandHandler
public void on (HomeAdvertiseCommand command){
cacheService.update(new UpdateCache(command.getHomeAdvertiseDto(),repository));
AggregateLifecycle.apply(new HomeAdvertiseEvent(command.getHomeAdvertiseDto()));
}}
