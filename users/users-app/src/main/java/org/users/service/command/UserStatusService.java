package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.users.dto.agg.UserStatusDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.aggre.UserStatusCommand;
@Service
public class UserStatusService{
@Autowired
private CommandGateway commandGateway;
public void UserStatus(UserStatusDto dto){
AbstractCommand command=new UserStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}