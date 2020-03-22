package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class OrderCreateService{
@Autowired
private CommandGateway commandGateway;
public void OrderCreate(OrderCreateDto dto){
AbstractCommand command=new OrderCreateCommand(dto);
commandGateway.sendAndWait(command);
}
}