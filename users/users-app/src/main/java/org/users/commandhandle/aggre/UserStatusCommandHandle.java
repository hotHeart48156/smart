package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.UserStatusEvent;
import org.users.executor.command.aggre.UserStatusCommand;

@Value
public class UserStatusCommandHandle{
@CommandHandler
public void on (UserStatusCommand Command){
AggregateLifecycle.apply(new UserStatusEvent(Command.getUserStatusDto()));
}}
