package org.activite.commandhandle.entity;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.GroupRepository;
import org.activite.event.GroupEvent;
import org.activite.executor.command.entity.GroupCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class GroupCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  GroupRepository repository;
@CommandHandler
public void on (GroupCommand command){
cacheService.update(new UpdateCache(command.getGroupDto(),repository));
AggregateLifecycle.apply(new GroupEvent(command.getGroupDto()));
}}
