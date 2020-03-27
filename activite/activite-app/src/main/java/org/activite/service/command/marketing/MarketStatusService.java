package  org.activite.service.command.marketing;

import org.activite.dto.agg.marketing.MarketStatusDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.marketing.MarketStatusCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class MarketStatusService{
@Autowired
private CommandGateway commandGateway;
public void MarketStatus(MarketStatusDto dto){
AbstractCommand command=new MarketStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}