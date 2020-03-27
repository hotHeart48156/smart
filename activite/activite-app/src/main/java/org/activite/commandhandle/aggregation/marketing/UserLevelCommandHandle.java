package org.activite.commandhandle.aggregation.marketing;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.MarketingRepository;
import org.activite.event.UserLevelEvent;
import org.activite.executor.command.aggregation.marketing.UserLevelCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class UserLevelCommandHandle  extends AbstractMarketingCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  MarketingRepository repository;
@CommandHandler
public void on (UserLevelCommand command){
cacheService.update(new UpdateCache(command.getUserLevelDto(),repository));
AggregateLifecycle.apply(new UserLevelEvent(command.getUserLevelDto()));
}}
