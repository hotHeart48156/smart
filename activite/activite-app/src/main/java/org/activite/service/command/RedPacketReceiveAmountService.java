package  org.activite.service.command;

import org.activite.dto.agg.redpacket.RedPacketReceiveAmountDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.RedPacketReceiveAmountCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class RedPacketReceiveAmountService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void RedPacketReceiveAmount(RedPacketReceiveAmountDto dto){
AbstractCommand command=new RedPacketReceiveAmountCommand(dto);
commandGateway.sendAndWait(command);
}
}