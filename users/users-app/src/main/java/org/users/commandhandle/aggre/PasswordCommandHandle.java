package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.PasswordEvent;
import org.users.executor.command.aggre.PasswordCommand;

@Value
public class PasswordCommandHandle{
@CommandHandler
public void on (PasswordCommand Command){
AggregateLifecycle.apply(new PasswordEvent(Command.getPasswordDto()));
}}
