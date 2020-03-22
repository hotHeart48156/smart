package  org.order.commandhandle;
import lombok.Value;
@Value
public class OrderStatusCommandHandle{
@CommandHandler
public void on (OrderStatusCommand Command){
AggregateLifecycle.apply(new OrderStatusEvent(Command.getOrderStatusDto()));
}}
