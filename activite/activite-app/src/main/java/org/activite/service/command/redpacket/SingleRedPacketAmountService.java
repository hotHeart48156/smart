package  org.activite.service.command.redpacket;

import org.activite.dto.agg.redpacket.SingleRedPacketAmountDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.redpacket.SingleRedPacketAmountCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class SingleRedPacketAmountService{
@Autowired
private CommandGateway commandGateway;
public void SingleRedPacketAmount(SingleRedPacketAmountDto dto){
AbstractCommand command=new SingleRedPacketAmountCommand(dto);
commandGateway.sendAndWait(command);
}
}