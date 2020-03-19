package  org.activite.service.command;

import org.activite.dto.agg.PlatformDto;
import org.activite.executor.AbstractCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class PlatformService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void Platform(PlatformDto dto){
AbstractCommand command=new PlatformCommand(dto);
commandGateway.sendAndWait(command);
}
}