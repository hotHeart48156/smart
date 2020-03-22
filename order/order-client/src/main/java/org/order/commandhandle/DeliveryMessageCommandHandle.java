package  org.order.commandhandle;
import lombok.Value;
@Value
public class DeliveryMessageCommandHandle{
@CommandHandler
public void on (DeliveryMessageCommand Command){
AggregateLifecycle.apply(new DeliveryMessageEvent(Command.getDeliveryMessageDto()));
}}
