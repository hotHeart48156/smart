package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.domain.repository.UserRepository;
import org.users.domainevent.aggevent.IntegrationEvent;
import org.users.executor.command.aggre.IntegrationCommand;

@Value
public class IntegrationCommandHandle{
    @Autowired
    UserRepository repository;
    @Autowired
    CacheService cacheService;
@CommandHandler
public void on (IntegrationCommand Command){
AggregateLifecycle.apply(new IntegrationEvent(Command.getIntegrationDto()));
}}
