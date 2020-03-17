package  org.users.commandhandle.entity;
import lombok.Value;
@Value
public class EntityFactoryCommandHandle{
@CommandHandler
public void on (EntityFactoryCommand Command){
AggregateLifecycle.apply(new EntityFactoryEvent(Command.getEntityFactoryDto()));
}}
