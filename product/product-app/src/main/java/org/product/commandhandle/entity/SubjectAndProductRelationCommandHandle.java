package  org.product.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.cache.CacheService;
import org.product.cache.UpdateCache;
import org.product.domain.repository.entity.SubjectAndProductRelationRepository;
import org.product.event.SubjectAndProductRelationEvent;
import org.product.executor.command.entity.SubjectAndProductRelationCommand;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;
@Value


@Component
public class SubjectAndProductRelationCommandHandle  extends AbstractEntityCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  SubjectAndProductRelationRepository repository;
@CommandHandler
public void on (SubjectAndProductRelationCommand command){
cacheService.update(new UpdateCache(command.getSubjectAndProductRelationDto(),repository));
AggregateLifecycle.apply(new SubjectAndProductRelationEvent(command.getSubjectAndProductRelationDto()));
}}
