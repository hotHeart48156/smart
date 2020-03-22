package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class GiftsService{
@Autowired
private CommandGateway commandGateway;
public void Gifts(GiftsDto dto){
AbstractCommand command=new GiftsCommand(dto);
commandGateway.sendAndWait(command);
}
}