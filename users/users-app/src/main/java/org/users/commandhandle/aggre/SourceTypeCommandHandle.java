package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.domain.repository.UserRepository;
import org.users.domainevent.aggevent.SourceTypeEvent;
import org.users.executor.command.aggre.SourceTypeCommand;

@Value
public class SourceTypeCommandHandle{
    @Autowired
    UserRepository repository;
    @Autowired
    CacheService cacheService;
@CommandHandler
public void on (SourceTypeCommand Command){
AggregateLifecycle.apply(new SourceTypeEvent(Command.getSourceTypeDto()));
}}
