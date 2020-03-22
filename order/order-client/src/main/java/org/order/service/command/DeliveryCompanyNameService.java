package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class DeliveryCompanyNameService{
@Autowired
private CommandGateway commandGateway;
public void DeliveryCompanyName(DeliveryCompanyNameDto dto){
AbstractCommand command=new DeliveryCompanyNameCommand(dto);
commandGateway.sendAndWait(command);
}
}