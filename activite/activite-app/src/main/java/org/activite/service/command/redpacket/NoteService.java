package  org.activite.service.command.redpacket;

import org.activite.dto.agg.redpacket.NoteDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.redpacket.NoteCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class NoteService{
@Autowired
private CommandGateway commandGateway;
public void Note(NoteDto dto){
AbstractCommand command=new NoteCommand(dto);
commandGateway.sendAndWait(command);
}
}