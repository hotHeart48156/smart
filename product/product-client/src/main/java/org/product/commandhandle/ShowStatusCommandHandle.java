package  org.product.commandhandle;
import lombok.Value;
@Value
public class ShowStatusCommandHandle{
@CommandHandler
public void on (ShowStatusCommand Command){
AggregateLifecycle.apply(new ShowStatusEvent(Command.getShowStatusDto()));
}}
