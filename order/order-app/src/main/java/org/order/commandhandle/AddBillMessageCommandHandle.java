package  org.order.commandhandle;
import lombok.Value;
@Value
public class AddBillMessageCommandHandle{
@CommandHandler
public void on (AddBillMessageCommand Command){
AggregateLifecycle.apply(new AddBillMessageEvent(Command.getAddBillMessageDto()));
}}
