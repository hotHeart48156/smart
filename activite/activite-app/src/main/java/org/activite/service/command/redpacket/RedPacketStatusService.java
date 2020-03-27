package  org.activite.service.command.redpacket;

import org.activite.dto.agg.redpacket.RedPacketStatusDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.redpacket.RedPacketStatusCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class RedPacketStatusService{
@Autowired
private CommandGateway commandGateway;
public void RedPacketStatus(RedPacketStatusDto dto){
AbstractCommand command=new RedPacketStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}