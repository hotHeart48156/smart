package  org.activite.service.command;

import org.activite.dto.agg.RedPacketAmountDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.RedPacketAmountCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class RedPacketAmountService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void RedPacketAmount(RedPacketAmountDto dto){
AbstractCommand command=new RedPacketAmountCommand(dto);
commandGateway.sendAndWait(command);
}
}