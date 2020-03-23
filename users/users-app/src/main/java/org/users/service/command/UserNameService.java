package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.executor.AbstractQuery;
import org.users.executor.command.aggre.UserNameCommand;

import org.springframework.stereotype.Service;
@Service
public class UserNameService{
@Autowired
private CommandGateway commandGateway;
public void UserName(UserNameDto dto){
AbstractQuery command=new UserNameCommand(dto);
commandGateway.sendAndWait(command);
}
}