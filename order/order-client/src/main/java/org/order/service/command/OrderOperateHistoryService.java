package  org.order.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class OrderOperateHistoryService{
@Autowired
private CommandGateway commandGateway;
public void OrderOperateHistory(OrderOperateHistoryDto dto){
AbstractCommand command=new OrderOperateHistoryCommand(dto);
commandGateway.sendAndWait(command);
}
}