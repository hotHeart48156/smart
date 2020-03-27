package  org.order.commandhandle;import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.order.cache.CacheService;
import org.order.cache.UpdateCache;
import org.order.domain.repository.OrderRepository;
import org.order.event.NoteEvent;
import org.order.executor.command.NoteCommand;
import org.springframework.beans.factory.annotation.Autowired;


@Value
public class NoteCommandHandle  extends AbstractCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  OrderRepository repository;
@CommandHandler
public void on (NoteCommand command){
cacheService.update(new UpdateCache(command.getNoteDto(),repository));
AggregateLifecycle.apply(new NoteEvent(command.getNoteDto()));
}}
