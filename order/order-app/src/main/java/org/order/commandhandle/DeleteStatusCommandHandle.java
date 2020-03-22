package  org.order.commandhandle;
import lombok.Value;
@Value
public class DeleteStatusCommandHandle{
@CommandHandler
public void on (DeleteStatusCommand Command){
AggregateLifecycle.apply(new DeleteStatusEvent(Command.getDeleteStatusDto()));
}}
