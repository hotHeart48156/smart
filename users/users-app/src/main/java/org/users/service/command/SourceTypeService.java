package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.executor.AbstractQuery;
import org.users.executor.command.aggre.SourceTypeCommand;

import org.springframework.stereotype.Service;
@Service
public class SourceTypeService{
@Autowired
private CommandGateway commandGateway;
public void SourceType(SourceTypeDto dto){
AbstractQuery command=new SourceTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}