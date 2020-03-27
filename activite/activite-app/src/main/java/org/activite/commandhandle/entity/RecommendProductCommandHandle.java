package org.activite.commandhandle.entity;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.RecommendProductRepository;
import org.activite.event.RecommendProductEvent;
import org.activite.executor.command.entity.RecommendProductCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class RecommendProductCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  RecommendProductRepository repository;
@CommandHandler
public void on (RecommendProductCommand command){
cacheService.update(new UpdateCache(command.getRecommendProductDto(),repository));
AggregateLifecycle.apply(new RecommendProductEvent(command.getRecommendProductDto()));
}}
