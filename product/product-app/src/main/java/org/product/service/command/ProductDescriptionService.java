package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductDescriptionService{
@Autowired
private CommandGateway commandGateway;
public void ProductDescription(ProductDescriptionDto dto){
AbstractCommand command=new ProductDescriptionCommand(dto);
commandGateway.sendAndWait(command);
}
}