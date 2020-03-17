package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.UserIconEvent;
import org.users.executor.command.aggre.UserIconCommand;

@Value
public class UserIconCommandHandle{
@CommandHandler
public void on (UserIconCommand Command){
AggregateLifecycle.apply(new UserIconEvent(Command.getUserIconDto()));
}}
