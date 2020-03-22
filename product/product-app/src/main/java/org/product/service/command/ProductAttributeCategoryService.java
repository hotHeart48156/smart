package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductAttributeCategoryService{
@Autowired
private CommandGateway commandGateway;
public void ProductAttributeCategory(ProductAttributeCategoryDto dto){
AbstractCommand command=new ProductAttributeCategoryCommand(dto);
commandGateway.sendAndWait(command);
}
}