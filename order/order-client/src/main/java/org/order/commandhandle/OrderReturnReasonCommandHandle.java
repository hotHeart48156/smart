package  org.order.commandhandle;
import lombok.Value;
@Value
public class OrderReturnReasonCommandHandle{
@CommandHandler
public void on (OrderReturnReasonCommand Command){
AggregateLifecycle.apply(new OrderReturnReasonEvent(Command.getOrderReturnReasonDto()));
}}
