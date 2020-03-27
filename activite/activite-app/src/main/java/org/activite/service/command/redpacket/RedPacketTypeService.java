package  org.activite.service.command.redpacket;

import org.activite.dto.agg.redpacket.RedPacketTypeDto;
import org.activite.executor.command.aggregation.redpacket.RedPacketTypeCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class RedPacketTypeService{
@Autowired
private CommandGateway commandGateway;
public void RedPacketType(RedPacketTypeDto dto){
AbstractCommand command=new RedPacketTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}