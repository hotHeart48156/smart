package  org.activite.service.command;

import org.activite.dto.agg.marketing.UserLevelDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.UserLevelCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class UserLevelService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void UserLevel(UserLevelDto dto){
AbstractCommand command=new UserLevelCommand(dto);
commandGateway.sendAndWait(command);
}
}