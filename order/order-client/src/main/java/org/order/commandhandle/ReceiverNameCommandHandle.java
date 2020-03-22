package  org.order.commandhandle;
import lombok.Value;
@Value
public class ReceiverNameCommandHandle{
@CommandHandler
public void on (ReceiverNameCommand Command){
AggregateLifecycle.apply(new ReceiverNameEvent(Command.getReceiverNameDto()));
}}
