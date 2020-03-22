package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class LetterService{
@Autowired
private CommandGateway commandGateway;
public void Letter(LetterDto dto){
AbstractCommand command=new LetterCommand(dto);
commandGateway.sendAndWait(command);
}
}