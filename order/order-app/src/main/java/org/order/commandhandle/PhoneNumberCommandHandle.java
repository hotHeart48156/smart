package  org.order.commandhandle;
import lombok.Value;
@Value
public class PhoneNumberCommandHandle{
@CommandHandler
public void on (PhoneNumberCommand Command){
AggregateLifecycle.apply(new PhoneNumberEvent(Command.getPhoneNumberDto()));
}}
