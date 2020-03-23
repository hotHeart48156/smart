package  org.activite.service.command;

import org.activite.dto.agg.redpacket.RedPacketIdDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.RedPacketIdCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class RedPacketIdService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void RedPacketId(RedPacketIdDto dto){
AbstractCommand command=new RedPacketIdCommand(dto);
commandGateway.sendAndWait(command);
}
}