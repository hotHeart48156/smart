package  org.product.commandhandle;

import lombok.Value;
import org.product.command.AddressCommand;
import org.product.event.AddressEvent;

@Value
public class AddressCommandHandle{
@CommandHandler
public void on (AddressCommand Command){
AggregateLifecycle.apply(new AddressEvent(Command.getAddressDto()));
}}
