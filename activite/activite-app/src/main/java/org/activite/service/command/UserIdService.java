package  org.activite.service.command;

import org.activite.dto.agg.UserIdDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.UserIdCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class UserIdService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void UserId(UserIdDto dto){
AbstractCommand command=new UserIdCommand(dto);
commandGateway.sendAndWait(command);
}
}