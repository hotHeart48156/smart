package  org.activite.service.command;

import org.activite.executor.AbstractCommand;
import org.activite.executor.command.MarketingIdCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MarketingIdService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void MarketingId(MarketingIdDto dto){
AbstractCommand command=new MarketingIdCommand(dto);
commandGateway.sendAndWait(command);
}
}