package  org.activite.service.command;

import org.activite.dto.agg.marketing.EndTimeDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.EndTimeCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class EndTimeService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void EndTime(EndTimeDto dto){
AbstractCommand command=new EndTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}