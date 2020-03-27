package  org.activite.service.command.redpacket;

import org.activite.dto.agg.redpacket.RedPacketReceiveAmountDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.redpacket.RedPacketReceiveAmountCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class RedPacketReceiveAmountService{
@Autowired
private CommandGateway commandGateway;
public void RedPacketReceiveAmount(RedPacketReceiveAmountDto dto){
AbstractCommand command=new RedPacketReceiveAmountCommand(dto);
commandGateway.sendAndWait(command);
}
}