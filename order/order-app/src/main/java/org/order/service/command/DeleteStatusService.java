package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.DeleteStatusDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.DeleteStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteStatusService{
@Autowired
private CommandGateway commandGateway;
public void DeleteStatus(DeleteStatusDto dto){
AbstractCommand command=new DeleteStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}