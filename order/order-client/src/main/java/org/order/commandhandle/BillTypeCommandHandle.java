package  org.order.commandhandle;
import lombok.Value;
@Value
public class BillTypeCommandHandle{
@CommandHandler
public void on (BillTypeCommand Command){
AggregateLifecycle.apply(new BillTypeEvent(Command.getBillTypeDto()));
}}
