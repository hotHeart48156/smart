package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.UserNameEvent;
import org.users.executor.command.aggre.UserNameCommand;

@Value
public class UserNameCommandHandle{
@CommandHandler
public void on (UserNameCommand Command){
AggregateLifecycle.apply(new UserNameEvent(Command.getUserNameDto()));
}}
