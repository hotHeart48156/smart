package  org.order.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class DeliveryMessageService{
@Autowired
private CommandGateway commandGateway;
public void DeliveryMessage(DeliveryMessageDto dto){
AbstractCommand command=new DeliveryMessageCommand(dto);
commandGateway.sendAndWait(command);
}
}