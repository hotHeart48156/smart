package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class OrderStatusService{
@Autowired
private CommandGateway commandGateway;
public void OrderStatus(OrderStatusDto dto){
AbstractCommand command=new OrderStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}