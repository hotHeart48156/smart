package  org.users.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.UserCollectEvent;
import org.users.executor.command.entity.UserCollectCommand;

@Value
public class UserCollectCommandHandle{
@CommandHandler
public void on (UserCollectCommand Command){
AggregateLifecycle.apply(new UserCollectEvent(Command.getUserCollectDto()));
}}
