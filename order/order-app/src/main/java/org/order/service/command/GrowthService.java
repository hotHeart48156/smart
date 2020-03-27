package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.GrowthDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.GrowthCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrowthService{
@Autowired
private CommandGateway commandGateway;
public void Growth(GrowthDto dto){
AbstractCommand command=new GrowthCommand(dto);
commandGateway.sendAndWait(command);
}
}