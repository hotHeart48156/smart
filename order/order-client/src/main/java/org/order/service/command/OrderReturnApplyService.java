package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class OrderReturnApplyService{
@Autowired
private CommandGateway commandGateway;
public void OrderReturnApply(OrderReturnApplyDto dto){
AbstractCommand command=new OrderReturnApplyCommand(dto);
commandGateway.sendAndWait(command);
}
}