package  org.activite.service.command;

import org.activite.dto.agg.redpacket.RedPacketTypeDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.RedPacketTypeCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class RedPacketTypeService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void RedPacketType(RedPacketTypeDto dto){
AbstractCommand command=new RedPacketTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}