package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.dto.entity.UserCollectDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.entity.UserCollectCommand;

import org.springframework.stereotype.Service;
@Service
public class UserCollectService{
@Autowired
private CommandGateway commandGateway;
public void UserCollect(UserCollectDto dto){
AbstractCommand command=new UserCollectCommand(dto);
commandGateway.sendAndWait(command);
}
}