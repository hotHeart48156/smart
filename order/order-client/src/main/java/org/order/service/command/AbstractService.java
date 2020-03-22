package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class AbstractService{
@Autowired
private CommandGateway commandGateway;
public void Abstract(AbstractDto dto){
AbstractCommand command=new AbstractCommand(dto);
commandGateway.sendAndWait(command);
}
}