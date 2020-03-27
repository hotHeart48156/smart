package  org.activite.service.command.redpacket;

import org.activite.dto.agg.redpacket.SendTimeDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.redpacket.SendTimeCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class SendTimeService{
@Autowired
private CommandGateway commandGateway;
public void SendTime(SendTimeDto dto){
AbstractCommand command=new SendTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}