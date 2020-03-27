package  org.activite.service.command.entity;

import org.activite.dto.entity.HomeAdvertiseDto;
import org.activite.executor.command.entity.HomeAdvertiseCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class HomeAdvertiseService{
@Autowired
private CommandGateway commandGateway;
public void HomeAdvertise(HomeAdvertiseDto dto){
AbstractCommand command=new HomeAdvertiseCommand(dto);
commandGateway.sendAndWait(command);
}
}