package  org.activite.service.command;

import org.activite.dto.agg.redpacket.SendTimeDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.SendTimeCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class SendTimeService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void SendTime(SendTimeDto dto){
AbstractCommand command=new SendTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}