package  org.order.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.DeliverySnCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DeliverySnService{
@Autowired
private CommandGateway commandGateway;
public void DeliverySn(DeliverySnDto dto){
AbstractCommand command=new DeliverySnCommand(dto);
commandGateway.sendAndWait(command);
}
}