package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ConfirmStatusService{
@Autowired
private CommandGateway commandGateway;
public void ConfirmStatus(ConfirmStatusDto dto){
AbstractCommand command=new ConfirmStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}