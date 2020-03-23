package  org.product.commandhandle;

import lombok.Value;
import org.product.event.AddressEvent;
import org.product.executor.command.entity.AddressCommand;

@Value
public class AddressCommandHandle{
@CommandHandler
public void on (AddressCommand Command){
AggregateLifecycle.apply(new AddressEvent(Command.getAddressDto()));
}}
