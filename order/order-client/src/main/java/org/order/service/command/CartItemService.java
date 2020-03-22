package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class CartItemService{
@Autowired
private CommandGateway commandGateway;
public void CartItem(CartItemDto dto){
AbstractCommand command=new CartItemCommand(dto);
commandGateway.sendAndWait(command);
}
}