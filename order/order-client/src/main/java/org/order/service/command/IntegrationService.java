package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class IntegrationService{
@Autowired
private CommandGateway commandGateway;
public void Integration(IntegrationDto dto){
AbstractCommand command=new IntegrationCommand(dto);
commandGateway.sendAndWait(command);
}
}