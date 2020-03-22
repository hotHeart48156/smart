package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductAttributeService{
@Autowired
private CommandGateway commandGateway;
public void ProductAttribute(ProductAttributeDto dto){
AbstractCommand command=new ProductAttributeCommand(dto);
commandGateway.sendAndWait(command);
}
}