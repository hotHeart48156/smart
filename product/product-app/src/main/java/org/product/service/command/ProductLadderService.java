package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductLadderService{
@Autowired
private CommandGateway commandGateway;
public void ProductLadder(ProductLadderDto dto){
AbstractCommand command=new ProductLadderCommand(dto);
commandGateway.sendAndWait(command);
}
}