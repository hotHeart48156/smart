package org.activite.commandhandle.entity;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.CouponHistoryRepository;
import org.activite.event.CouponHistoryEvent;
import org.activite.executor.command.entity.CouponHistoryCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class CouponHistoryCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  CouponHistoryRepository repository;
@CommandHandler
public void on (CouponHistoryCommand command){
cacheService.update(new UpdateCache(command.getCouponHistoryDto(),repository));
AggregateLifecycle.apply(new CouponHistoryEvent(command.getCouponHistoryDto()));
}}
