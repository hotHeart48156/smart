package org.activite.commandhandle.aggregation.marketing;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.MarketingRepository;
import org.activite.event.ActivityGoodsEvent;
import org.activite.executor.command.aggregation.marketing.ActivityGoodsCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class ActivityGoodsCommandHandle  extends AbstractMarketingCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  MarketingRepository repository;
@CommandHandler
public void on (ActivityGoodsCommand command){
cacheService.update(new UpdateCache(command.getActivityGoodsDto(),repository));
AggregateLifecycle.apply(new ActivityGoodsEvent(command.getActivityGoodsDto()));
}}
