package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.OrderDeleteStatusDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.OrderDeleteStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDeleteStatusService{
@Autowired
private CommandGateway commandGateway;
public void OrderDeleteStatus(OrderDeleteStatusDto dto){
AbstractCommand command=new OrderDeleteStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}