package  org.order.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class AddressService{
@Autowired
private CommandGateway commandGateway;
public void Address(AddressDto dto){
AbstractCommand command=new AddressCommand(dto);
commandGateway.sendAndWait(command);
}
}