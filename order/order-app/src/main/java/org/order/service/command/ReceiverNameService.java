package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.ReceiverNameDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.ReceiverNameCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiverNameService{
@Autowired
private CommandGateway commandGateway;
public void ReceiverName(ReceiverNameDto dto){
AbstractCommand command=new ReceiverNameCommand(dto);
commandGateway.sendAndWait(command);
}
}