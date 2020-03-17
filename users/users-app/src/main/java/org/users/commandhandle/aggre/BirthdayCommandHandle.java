package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.BirthdayEvent;
import org.users.executor.command.aggre.BirthdayCommand;

@Value
public class BirthdayCommandHandle{
@CommandHandler
public void on (BirthdayCommand Command){
AggregateLifecycle.apply(new BirthdayEvent(Command.getBirthdayDto()));
}}
