package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class OrderDeleteStatusService{
@Autowired
private CommandGateway commandGateway;
public void OrderDeleteStatus(OrderDeleteStatusDto dto){
AbstractCommand command=new OrderDeleteStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}