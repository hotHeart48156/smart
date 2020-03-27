package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.OrderStatusDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.OrderStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusService{
@Autowired
private CommandGateway commandGateway;
public void OrderStatus(OrderStatusDto dto){
AbstractCommand command=new OrderStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}