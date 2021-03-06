package  org.activite.commandhandle.aggregation.redpacket;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.RedPacketRepository;
import org.activite.event.RedPacketIdEvent;
import org.activite.executor.command.aggregation.redpacket.RedPacketIdCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class RedPacketIdCommandHandle  extends AbstractRedPacketCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private RedPacketRepository repository;
@CommandHandler
public void on (RedPacketIdCommand command){
cacheService.update(new UpdateCache(command.getRedPacketIdDto(),repository));
AggregateLifecycle.apply(new RedPacketIdEvent(command.getRedPacketIdDto()));
}}
