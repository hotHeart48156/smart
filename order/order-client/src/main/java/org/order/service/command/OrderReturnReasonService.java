package  org.order.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class OrderReturnReasonService{
@Autowired
private CommandGateway commandGateway;
public void OrderReturnReason(OrderReturnReasonDto dto){
AbstractCommand command=new OrderReturnReasonCommand(dto);
commandGateway.sendAndWait(command);
}
}