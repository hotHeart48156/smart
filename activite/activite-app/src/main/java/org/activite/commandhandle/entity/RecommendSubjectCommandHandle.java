package org.activite.commandhandle.entity;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.RecommendSubjectRepository;
import org.activite.event.RecommendSubjectEvent;
import org.activite.executor.command.entity.RecommendSubjectCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class RecommendSubjectCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  RecommendSubjectRepository repository;
@CommandHandler
public void on (RecommendSubjectCommand command){
cacheService.update(new UpdateCache(command.getRecommendSubjectDto(),repository));
AggregateLifecycle.apply(new RecommendSubjectEvent(command.getRecommendSubjectDto()));
}}
