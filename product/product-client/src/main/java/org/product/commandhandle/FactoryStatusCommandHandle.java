package  org.product.commandhandle;
import lombok.Value;
@Value
public class FactoryStatusCommandHandle{
@CommandHandler
public void on (FactoryStatusCommand Command){
AggregateLifecycle.apply(new FactoryStatusEvent(Command.getFactoryStatusDto()));
}}
