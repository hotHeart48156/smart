package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.dto.agg.GrowthDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.aggre.GrowthCommand;

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