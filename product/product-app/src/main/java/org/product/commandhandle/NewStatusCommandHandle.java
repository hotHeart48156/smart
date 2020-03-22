package  org.product.commandhandle;
import lombok.Value;
@Value
public class NewStatusCommandHandle{
@CommandHandler
public void on (NewStatusCommand Command){
AggregateLifecycle.apply(new NewStatusEvent(Command.getNewStatusDto()));
}}
