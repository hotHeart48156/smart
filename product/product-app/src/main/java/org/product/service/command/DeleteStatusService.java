package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class DeleteStatusService{
@Autowired
private CommandGateway commandGateway;
public void DeleteStatus(DeleteStatusDto dto){
AbstractCommand command=new DeleteStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}