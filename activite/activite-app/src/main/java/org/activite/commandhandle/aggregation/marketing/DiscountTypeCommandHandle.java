package org.activite.commandhandle.aggregation.marketing;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.MarketingRepository;
import org.activite.event.DiscountTypeEvent;
import org.activite.executor.command.aggregation.marketing.DiscountTypeCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class DiscountTypeCommandHandle  extends AbstractMarketingCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  MarketingRepository repository;
@CommandHandler
public void on (DiscountTypeCommand command){
cacheService.update(new UpdateCache(command.getDiscountTypeDto(),repository));
AggregateLifecycle.apply(new DiscountTypeEvent(command.getDiscountTypeDto()));
}}
