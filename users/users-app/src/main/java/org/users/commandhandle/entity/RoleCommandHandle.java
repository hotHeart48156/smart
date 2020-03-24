package  org.users.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.RoleEvent;
import org.users.executor.command.entity.RoleCommand;

@Value
public class RoleCommandHandle{
@CommandHandler
public void on (RoleCommand Command){
AggregateLifecycle.apply(new RoleEvent(Command.getRoleDto()));
}}
