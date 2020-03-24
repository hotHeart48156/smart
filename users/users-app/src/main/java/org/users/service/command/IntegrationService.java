package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.users.dto.agg.IntegrationDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.aggre.IntegrationCommand;
@Service
public class IntegrationService{
@Autowired
private CommandGateway commandGateway;
public void Integration(IntegrationDto dto){
AbstractCommand command=new IntegrationCommand(dto);
commandGateway.sendAndWait(command);
}
}