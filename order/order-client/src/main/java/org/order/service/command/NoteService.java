package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class NoteService{
@Autowired
private CommandGateway commandGateway;
public void Note(NoteDto dto){
AbstractCommand command=new NoteCommand(dto);
commandGateway.sendAndWait(command);
}
}