package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.executor.AbstractQuery;
import org.users.executor.command.aggre.UserIconCommand;

import org.springframework.stereotype.Service;
@Service
public class UserIconService{
@Autowired
private CommandGateway commandGateway;
public void UserIcon(UserIconDto dto){
AbstractQuery command=new UserIconCommand(dto);
commandGateway.sendAndWait(command);
}
}