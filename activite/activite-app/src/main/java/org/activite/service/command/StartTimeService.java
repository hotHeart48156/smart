package  org.activite.service.command;

import org.activite.executor.AbstractCommand;
import org.activite.executor.command.StartTimeCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StartTimeService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void StartTime(StartTimeDto dto){
AbstractCommand command=new StartTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}