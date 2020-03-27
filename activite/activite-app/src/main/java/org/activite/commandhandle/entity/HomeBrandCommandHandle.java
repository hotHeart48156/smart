package org.activite.commandhandle.entity;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.HomeBrandRepository;
import org.activite.event.HomeBrandEvent;
import org.activite.executor.command.entity.HomeBrandCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class HomeBrandCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  HomeBrandRepository repository;
@CommandHandler
public void on (HomeBrandCommand command){
cacheService.update(new UpdateCache(command.getHomeBrandDto(),repository));
AggregateLifecycle.apply(new HomeBrandEvent(command.getHomeBrandDto()));
}}
