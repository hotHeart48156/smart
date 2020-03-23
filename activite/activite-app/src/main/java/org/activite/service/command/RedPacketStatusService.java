package  org.activite.service.command;

import org.activite.dto.agg.redpacket.RedPacketStatusDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.RedPacketStatusCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class RedPacketStatusService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void RedPacketStatus(RedPacketStatusDto dto){
AbstractCommand command=new RedPacketStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}