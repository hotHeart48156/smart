package  org.order.commandhandle;
import lombok.Value;
@Value
public class OrderDeleteStatusCommandHandle{
@CommandHandler
public void on (OrderDeleteStatusCommand Command){
AggregateLifecycle.apply(new OrderDeleteStatusEvent(Command.getOrderDeleteStatusDto()));
}}
