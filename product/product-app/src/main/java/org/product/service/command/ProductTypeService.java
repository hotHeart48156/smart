package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductTypeService{
@Autowired
private CommandGateway commandGateway;
public void ProductType(ProductTypeDto dto){
AbstractCommand command=new ProductTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}