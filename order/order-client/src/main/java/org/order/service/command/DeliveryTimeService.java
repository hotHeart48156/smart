package  org.order.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class DeliveryTimeService{
@Autowired
private CommandGateway commandGateway;
public void DeliveryTime(DeliveryTimeDto dto){
AbstractCommand command=new DeliveryTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}