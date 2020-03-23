package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.executor.AbstractQuery;
import org.users.executor.command.aggre.GenderCommand;

import org.springframework.stereotype.Service;
@Service
public class GenderService{
@Autowired
private CommandGateway commandGateway;
public void Gender(GenderDto dto){
AbstractQuery command=new GenderCommand(dto);
commandGateway.sendAndWait(command);
}
}