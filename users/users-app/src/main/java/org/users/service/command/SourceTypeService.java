package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.users.dto.agg.SourceTypeDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.aggre.SourceTypeCommand;
@Service
public class SourceTypeService{
@Autowired
private CommandGateway commandGateway;
public void SourceType(SourceTypeDto dto){
AbstractCommand command=new SourceTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}