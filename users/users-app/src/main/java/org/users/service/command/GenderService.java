package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.users.dto.agg.GenderDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.aggre.GenderCommand;
@Service
public class GenderService{
@Autowired
private CommandGateway commandGateway;
public void Gender(GenderDto dto){
AbstractCommand command=new GenderCommand(dto);
commandGateway.sendAndWait(command);
}
}