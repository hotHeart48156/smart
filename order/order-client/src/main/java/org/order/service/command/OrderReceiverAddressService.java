package  org.order.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class OrderReceiverAddressService{
@Autowired
private CommandGateway commandGateway;
public void OrderReceiverAddress(OrderReceiverAddressDto dto){
AbstractCommand command=new OrderReceiverAddressCommand(dto);
commandGateway.sendAndWait(command);
}
}