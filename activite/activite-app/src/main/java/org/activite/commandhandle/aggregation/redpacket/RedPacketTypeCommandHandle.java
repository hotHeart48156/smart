package  org.activite.commandhandle.aggregation.redpacket;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.RedPacketRepository;
import org.activite.event.RedPacketTypeEvent;
import org.activite.executor.command.aggregation.redpacket.RedPacketTypeCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class RedPacketTypeCommandHandle  extends AbstractRedPacketCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private RedPacketRepository repository;
@CommandHandler
public void on (RedPacketTypeCommand command){
cacheService.update(new UpdateCache(command.getRedPacketTypeDto(),repository));
AggregateLifecycle.apply(new RedPacketTypeEvent(command.getRedPacketTypeDto()));
}}
