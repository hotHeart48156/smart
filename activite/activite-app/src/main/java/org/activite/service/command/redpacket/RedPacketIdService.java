package  org.activite.service.command.redpacket;

import org.activite.dto.agg.redpacket.RedPacketIdDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.redpacket.RedPacketIdCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class RedPacketIdService{
@Autowired
private CommandGateway commandGateway;
public void RedPacketId(RedPacketIdDto dto){
AbstractCommand command=new RedPacketIdCommand(dto);
commandGateway.sendAndWait(command);
}
}