package org.activite.commandhandle.entity;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.GroupMemberRepository;
import org.activite.event.GroupMemberEvent;
import org.activite.executor.command.entity.GroupMemberCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class GroupMemberCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  GroupMemberRepository repository;
@CommandHandler
public void on (GroupMemberCommand command){
cacheService.update(new UpdateCache(command.getGroupMemberDto(),repository));
AggregateLifecycle.apply(new GroupMemberEvent(command.getGroupMemberDto()));
}}
