package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.dto.agg.UserNameDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.aggre.UserNameCommand;

import org.springframework.stereotype.Service;
@Service
public class UserNameService{
@Autowired
private CommandGateway commandGateway;
public void UserName(UserNameDto dto){
AbstractCommand command=new UserNameCommand(dto);
commandGateway.sendAndWait(command);
}
}