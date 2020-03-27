package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.NoteDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.NoteCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService{
@Autowired
private CommandGateway commandGateway;
public void Note(NoteDto dto){
AbstractCommand command=new NoteCommand(dto);
commandGateway.sendAndWait(command);
}
}