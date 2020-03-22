package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductCategoryService{
@Autowired
private CommandGateway commandGateway;
public void ProductCategory(ProductCategoryDto dto){
AbstractCommand command=new ProductCategoryCommand(dto);
commandGateway.sendAndWait(command);
}
}