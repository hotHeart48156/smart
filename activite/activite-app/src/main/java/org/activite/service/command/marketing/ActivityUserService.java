package  org.activite.service.command.marketing;

import org.activite.dto.agg.marketing.ActivityUserDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.marketing.ActivityUserCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class ActivityUserService{
@Autowired
private CommandGateway commandGateway;
public void ActivityUser(ActivityUserDto dto){
AbstractCommand command=new ActivityUserCommand(dto);
commandGateway.sendAndWait(command);
}
}