package  org.activite.service.command.marketing;

import org.activite.dto.agg.marketing.UserLevelDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.marketing.UserLevelCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class UserLevelService{
@Autowired
private CommandGateway commandGateway;
public void UserLevel(UserLevelDto dto){
AbstractCommand command=new UserLevelCommand(dto);
commandGateway.sendAndWait(command);
}
}