package  org.activite.service.command;

import org.activite.dto.agg.SmallTypeDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.SmallTypeCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class SmallTypeService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void SmallType(SmallTypeDto dto){
AbstractCommand command=new SmallTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}