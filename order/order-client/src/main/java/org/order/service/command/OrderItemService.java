package  org.order.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class OrderItemService{
@Autowired
private CommandGateway commandGateway;
public void OrderItem(OrderItemDto dto){
AbstractCommand command=new OrderItemCommand(dto);
commandGateway.sendAndWait(command);
}
}