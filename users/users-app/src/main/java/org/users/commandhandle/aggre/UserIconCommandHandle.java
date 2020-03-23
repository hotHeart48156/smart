package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.domain.repository.UserRepository;
import org.users.domainevent.aggevent.UserIconEvent;
import org.users.executor.command.aggre.UserIconCommand;

@Value
public class UserIconCommandHandle{
    @Autowired
    UserRepository repository;
    @Autowired
    CacheService cacheService;
@CommandHandler
public void on (UserIconCommand Command){
AggregateLifecycle.apply(new UserIconEvent(Command.getUserIconDto()));
}}
