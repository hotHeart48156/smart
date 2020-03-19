package  org.activite.service.command;

import org.activite.dto.agg.NoteDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.NoteCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class NoteService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void Note(NoteDto dto){
AbstractCommand command=new NoteCommand(dto);
commandGateway.sendAndWait(command);
}
}