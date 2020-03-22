package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class GiftPointService{
@Autowired
private CommandGateway commandGateway;
public void GiftPoint(GiftPointDto dto){
AbstractCommand command=new GiftPointCommand(dto);
commandGateway.sendAndWait(command);
}
}