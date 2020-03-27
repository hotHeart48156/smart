package  org.activite.service.command.redpacket;

import org.activite.dto.agg.redpacket.RedPacketCountDto;
import org.activite.executor.command.aggregation.redpacket.RedPacketCountCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class RedPacketCountService{
@Autowired
private CommandGateway commandGateway;
public void RedPacketCount(RedPacketCountDto dto){
AbstractCommand command=new RedPacketCountCommand(dto);
commandGateway.sendAndWait(command);
}
}