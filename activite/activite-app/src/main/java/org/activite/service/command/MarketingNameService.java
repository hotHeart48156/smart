package  org.activite.service.command;

import org.activite.dto.agg.marketing.MarketingNameDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.MarketingNameCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MarketingNameService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void MarketingName(MarketingNameDto dto){
AbstractCommand command=new MarketingNameCommand(dto);
commandGateway.sendAndWait(command);
}
}