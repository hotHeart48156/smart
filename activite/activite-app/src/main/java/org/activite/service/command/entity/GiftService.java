package  org.activite.service.command.entity;

import org.activite.dto.entity.GiftDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.entity.GiftCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class GiftService{
@Autowired
private CommandGateway commandGateway;
public void Gift(GiftDto dto){
AbstractCommand command=new GiftCommand(dto);
commandGateway.sendAndWait(command);
}
}