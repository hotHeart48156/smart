package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductAttributeValueService{
@Autowired
private CommandGateway commandGateway;
public void ProductAttributeValue(ProductAttributeValueDto dto){
AbstractCommand command=new ProductAttributeValueCommand(dto);
commandGateway.sendAndWait(command);
}
}