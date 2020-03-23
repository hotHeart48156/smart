package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.domain.repository.UserRepository;
import org.users.domainevent.aggevent.UserStatusEvent;
import org.users.executor.command.aggre.UserStatusCommand;

@Value
public class UserStatusCommandHandle{
    @Autowired
    UserRepository repository;
    @Autowired
    CacheService cacheService;
@CommandHandler
public void on (UserStatusCommand Command){
AggregateLifecycle.apply(new UserStatusEvent(Command.getUserStatusDto()));
}}
