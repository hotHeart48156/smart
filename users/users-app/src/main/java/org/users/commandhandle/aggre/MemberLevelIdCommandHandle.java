package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.users.cache.CacheService;
import org.users.domain.aggregation.User;
import org.users.domain.repository.UserRepository;
import org.users.domainevent.aggevent.MemberLevelIdEvent;
import org.users.executor.command.aggre.MemberLevelIdCommand;

@Value
@Component
public class MemberLevelIdCommandHandle{
    @Autowired
    UserRepository repository;
    @Autowired
    CacheService service;
@CommandHandler
public void on (MemberLevelIdCommand command){
    User user=service.
    service.create("user",command.getMemberLevelIdDto().getUserId().toString(),command.getMemberLevelIdDto(),repository)
AggregateLifecycle.apply(new MemberLevelIdEvent(command.getMemberLevelIdDto()));
}}
