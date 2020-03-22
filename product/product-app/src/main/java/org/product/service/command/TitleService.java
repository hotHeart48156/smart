package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class TitleService{
@Autowired
private CommandGateway commandGateway;
public void Title(TitleDto dto){
AbstractCommand command=new TitleCommand(dto);
commandGateway.sendAndWait(command);
}
}