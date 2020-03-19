package  org.activite.service.command;

import org.activite.dto.agg.ActivityUserDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.ActivityUserCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ActivityUserService{
@Autowired
private CommandGateway commandGateway;
public void ActivityUser(ActivityUserDto dto){
AbstractCommand command=new ActivityUserCommand(dto);
commandGateway.sendAndWait(command);
}
  }