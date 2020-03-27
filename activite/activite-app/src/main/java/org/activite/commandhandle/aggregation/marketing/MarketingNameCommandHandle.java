package org.activite.commandhandle.aggregation.marketing;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.MarketingRepository;
import org.activite.event.MarketingNameEvent;
import org.activite.executor.command.aggregation.marketing.MarketingNameCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class MarketingNameCommandHandle  extends AbstractMarketingCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  MarketingRepository repository;
@CommandHandler
public void on (MarketingNameCommand command){
cacheService.update(new UpdateCache(command.getMarketingNameDto(),repository));
AggregateLifecycle.apply(new MarketingNameEvent(command.getMarketingNameDto()));
}}
