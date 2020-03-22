package  org.order.commandhandle;
import lombok.Value;
@Value
public class DeliveryTimeCommandHandle{
@CommandHandler
public void on (DeliveryTimeCommand Command){
AggregateLifecycle.apply(new DeliveryTimeEvent(Command.getDeliveryTimeDto()));
}}
