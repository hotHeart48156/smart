package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.DeliveryMessageDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.DeliveryMessageCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryMessageService{
@Autowired
private CommandGateway commandGateway;
public void DeliveryMessage(DeliveryMessageDto dto){
AbstractCommand command=new DeliveryMessageCommand(dto);
commandGateway.sendAndWait(command);
}
}