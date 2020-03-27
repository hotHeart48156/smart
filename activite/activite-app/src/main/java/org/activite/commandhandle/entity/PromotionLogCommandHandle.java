package org.activite.commandhandle.entity;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.PromotionLogRepository;
import org.activite.event.PromotionLogEvent;
import org.activite.executor.command.entity.PromotionLogCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class PromotionLogCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  PromotionLogRepository repository;
@CommandHandler
public void on (PromotionLogCommand command){
cacheService.update(new UpdateCache(command.getPromotionLogDto(),repository));
AggregateLifecycle.apply(new PromotionLogEvent(command.getPromotionLogDto()));
}}
