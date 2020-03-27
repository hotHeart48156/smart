package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.IntegrationDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.IntegrationCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService{
@Autowired
private CommandGateway commandGateway;
public void Integration(IntegrationDto dto){
AbstractCommand command=new IntegrationCommand(dto);
commandGateway.sendAndWait(command);
}
}