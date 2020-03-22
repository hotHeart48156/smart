package  org.users.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.executor.command.entity.EntityFactoryCommand;

@Value
public class EntityFactoryCommandHandle{
@CommandHandler
public void on (EntityFactoryCommand Command){
AggregateLifecycle.apply(new EntityFactoryEvent(Command.getEntityFactoryDto()));
}}
