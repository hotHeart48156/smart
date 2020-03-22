package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.users.domain.repository.UserRepository;
import org.users.domainevent.aggevent.BirthdayEvent;
import org.users.executor.command.aggre.BirthdayCommand;

@Value
@Component
public class BirthdayCommandHandle{
    @Autowired
    UserRepository repository;
@CommandHandler
public void on (BirthdayCommand Command)
{
AggregateLifecycle.apply(new BirthdayEvent(Command.getBirthdayDto()));
}}
