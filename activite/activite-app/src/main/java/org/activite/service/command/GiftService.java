package  org.activite.service.command;

import org.activite.dto.entity.GiftDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.GiftCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class GiftService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void Gift(GiftDto dto){
AbstractCommand command=new GiftCommand(dto);
commandGateway.sendAndWait(command);
}
}