package  org.activite.service.command;

import org.activite.dto.agg.SingleRedPacketAmountDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.SingleRedPacketAmountCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class SingleRedPacketAmountService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void SingleRedPacketAmount(SingleRedPacketAmountDto dto){
AbstractCommand command=new SingleRedPacketAmountCommand(dto);
commandGateway.sendAndWait(command);
}
}