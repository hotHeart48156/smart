package  org.activite.service.command;

import org.activite.dto.agg.redpacket.RedPacketCountDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.RedPacketCountCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class RedPacketCountService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void RedPacketCount(RedPacketCountDto dto){
AbstractCommand command=new RedPacketCountCommand(dto);
commandGateway.sendAndWait(command);
}
}