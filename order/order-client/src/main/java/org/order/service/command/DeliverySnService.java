package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class DeliverySnService{
@Autowired
private CommandGateway commandGateway;
public void DeliverySn(DeliverySnDto dto){
AbstractCommand command=new DeliverySnCommand(dto);
commandGateway.sendAndWait(command);
}
}