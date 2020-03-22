package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductCountService{
@Autowired
private CommandGateway commandGateway;
public void ProductCount(ProductCountDto dto){
AbstractCommand command=new ProductCountCommand(dto);
commandGateway.sendAndWait(command);
}
}