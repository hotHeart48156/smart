package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.ConfirmStatusDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.ConfirmStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfirmStatusService{
@Autowired
private CommandGateway commandGateway;
public void ConfirmStatus(ConfirmStatusDto dto){
AbstractCommand command=new ConfirmStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}