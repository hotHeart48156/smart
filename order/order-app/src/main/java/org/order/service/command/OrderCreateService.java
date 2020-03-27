package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.OrderCreateDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.OrderCreateCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderCreateService{
@Autowired
private CommandGateway commandGateway;
public void OrderCreate(OrderCreateDto dto){
AbstractCommand command=new OrderCreateCommand(dto);
commandGateway.sendAndWait(command);
}
}