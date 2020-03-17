package  org.users.commandhandle.entity;
import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.AddressEvent;
import org.users.executor.command.entity.AddressCommand;

@Value
public class AddressCommandHandle{
@CommandHandler
public void on (AddressCommand command){
AggregateLifecycle.apply(new AddressEvent(command.getAddressDto()));
}}
