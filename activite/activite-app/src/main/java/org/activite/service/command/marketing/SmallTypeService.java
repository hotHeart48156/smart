package  org.activite.service.command.marketing;

import org.activite.dto.agg.marketing.SmallTypeDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.marketing.SmallTypeCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class SmallTypeService{
@Autowired
private CommandGateway commandGateway;
public void SmallType(SmallTypeDto dto){
AbstractCommand command=new SmallTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}