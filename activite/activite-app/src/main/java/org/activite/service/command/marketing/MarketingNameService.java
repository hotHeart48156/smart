package  org.activite.service.command.marketing;

import org.activite.dto.agg.marketing.MarketingNameDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.marketing.MarketingNameCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class MarketingNameService{
@Autowired
private CommandGateway commandGateway;
public void MarketingName(MarketingNameDto dto){
AbstractCommand command=new MarketingNameCommand(dto);
commandGateway.sendAndWait(command);
}
}