package  org.activite.service.command.redpacket;

import org.activite.dto.agg.redpacket.RedPacketAmountDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.redpacket.RedPacketAmountCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class RedPacketAmountService{
@Autowired
private CommandGateway commandGateway;
public void RedPacketAmount(RedPacketAmountDto dto){
AbstractCommand command=new RedPacketAmountCommand(dto);
commandGateway.sendAndWait(command);
}
}