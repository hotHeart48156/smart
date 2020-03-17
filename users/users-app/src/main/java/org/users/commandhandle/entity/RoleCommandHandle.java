package  org.users.commandhandle.entity;
import lombok.Value;
@Value
public class RoleCommandHandle{
@CommandHandler
public void on (RoleCommand Command){
AggregateLifecycle.apply(new RoleEvent(Command.getRoleDto()));
}}
