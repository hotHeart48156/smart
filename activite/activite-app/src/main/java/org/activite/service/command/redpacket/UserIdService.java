package  org.activite.service.command.redpacket;

import org.activite.dto.agg.redpacket.UserIdDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.redpacket.UserIdCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class UserIdService{
@Autowired
private CommandGateway commandGateway;
public void UserId(UserIdDto dto){
AbstractCommand command=new UserIdCommand(dto);
commandGateway.sendAndWait(command);
}
}