package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.cache.CommandCache;
import org.users.domain.repository.UserRepository;
import org.users.domainevent.aggevent.NickNameEvent;
import org.users.executor.command.aggre.NickNameCommand;

@Value
public class NickNameCommandHandle{
    @Autowired
    UserRepository repository;
    @Autowired
    CacheService service;
@CommandHandler
public void on (NickNameCommand command){
    service.create(new CommandCache(command.getNickNameDto(),repository));
    AggregateLifecycle.apply(new NickNameEvent(command.getNickNameDto()));
}}
