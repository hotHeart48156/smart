package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.entitydto.OrderItemDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.OrderItemCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderItemService{
@Autowired
private CommandGateway commandGateway;
public void OrderItem(OrderItemDto dto){
AbstractCommand command=new OrderItemCommand(dto);
commandGateway.sendAndWait(command);
}
}