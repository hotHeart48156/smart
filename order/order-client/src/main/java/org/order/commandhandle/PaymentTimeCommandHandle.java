package  org.order.commandhandle;
import lombok.Value;
@Value
public class PaymentTimeCommandHandle{
@CommandHandler
public void on (PaymentTimeCommand Command){
AggregateLifecycle.apply(new PaymentTimeEvent(Command.getPaymentTimeDto()));
}}
