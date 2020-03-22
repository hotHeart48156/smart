package  org.product.commandhandle;
import lombok.Value;
@Value
public class AbstractCommandHandle{
@CommandHandler
public void on (AbstractCommand Command){
AggregateLifecycle.apply(new AbstractEvent(Command.getAbstractDto()));
}}
