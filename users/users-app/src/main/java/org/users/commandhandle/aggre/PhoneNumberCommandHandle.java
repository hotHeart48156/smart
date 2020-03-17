package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.PhoneNumberEvent;
import org.users.executor.command.aggre.PhoneNumberCommand;

@Value
public class PhoneNumberCommandHandle{
@CommandHandler
public void on (PhoneNumberCommand Command){
AggregateLifecycle.apply(new PhoneNumberEvent(Command.getPhoneNumberDto()));
}}
