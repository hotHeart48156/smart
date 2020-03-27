package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.DeliveryTimeDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.DeliveryTimeCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryTimeService{
@Autowired
private CommandGateway commandGateway;
public void DeliveryTime(DeliveryTimeDto dto){
AbstractCommand command=new DeliveryTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}