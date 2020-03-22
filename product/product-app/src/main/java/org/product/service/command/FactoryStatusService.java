package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class FactoryStatusService{
@Autowired
private CommandGateway commandGateway;
public void FactoryStatus(FactoryStatusDto dto){
AbstractCommand command=new FactoryStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}