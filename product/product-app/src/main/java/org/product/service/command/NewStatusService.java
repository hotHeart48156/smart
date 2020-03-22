package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class NewStatusService{
@Autowired
private CommandGateway commandGateway;
public void NewStatus(NewStatusDto dto){
AbstractCommand command=new NewStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}