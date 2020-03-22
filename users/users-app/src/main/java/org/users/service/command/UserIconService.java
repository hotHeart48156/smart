package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.dto.agg.UserIconDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.aggre.UserIconCommand;

import org.springframework.stereotype.Service;
@Service
public class UserIconService{
@Autowired
private CommandGateway commandGateway;
public void UserIcon(UserIconDto dto){
AbstractCommand command=new UserIconCommand(dto);
commandGateway.sendAndWait(command);
}
}