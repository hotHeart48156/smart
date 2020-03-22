package  org.order.commandhandle;
import lombok.Value;
@Value
public class OrderCreateCommandHandle{
@CommandHandler
public void on (OrderCreateCommand Command){
AggregateLifecycle.apply(new OrderCreateEvent(Command.getOrderCreateDto()));
}}
