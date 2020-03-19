package  org.activite.service.command;

import org.activite.dto.agg.MarketStatusDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.MarketStatusCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MarketStatusService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void MarketStatus(MarketStatusDto dto){
AbstractCommand command=new MarketStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}