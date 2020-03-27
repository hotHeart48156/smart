package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.DeliveryCompanyNameDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.DeliveryCompanyNameCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryCompanyNameService{
@Autowired
private CommandGateway commandGateway;
public void DeliveryCompanyName(DeliveryCompanyNameDto dto){
AbstractCommand command=new DeliveryCompanyNameCommand(dto);
commandGateway.sendAndWait(command);
}
}