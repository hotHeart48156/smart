package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.entitydto.CartItemDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.CartItemCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CartItemService{
@Autowired
private CommandGateway commandGateway;
public void CartItem(CartItemDto dto){
AbstractCommand command=new CartItemCommand(dto);
commandGateway.sendAndWait(command);
}
}