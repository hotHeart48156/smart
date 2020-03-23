package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.executor.AbstractQuery;
import org.users.executor.command.aggre.IntegrationCommand;

import org.springframework.stereotype.Service;
@Service
public class IntegrationService{
@Autowired
private CommandGateway commandGateway;
public void Integration(IntegrationDto dto){
AbstractQuery command=new IntegrationCommand(dto);
commandGateway.sendAndWait(command);
}
}