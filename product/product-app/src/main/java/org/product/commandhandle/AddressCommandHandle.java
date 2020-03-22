package  org.product.commandhandle;
import lombok.Value;
@Value
public class AddressCommandHandle{
@CommandHandler
public void on (AddressCommand Command){
AggregateLifecycle.apply(new AddressEvent(Command.getAddressDto()));
}}
