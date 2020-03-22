package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class PreviewStatusService{
@Autowired
private CommandGateway commandGateway;
public void PreviewStatus(PreviewStatusDto dto){
AbstractCommand command=new PreviewStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}