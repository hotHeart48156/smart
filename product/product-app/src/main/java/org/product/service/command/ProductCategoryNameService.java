package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductCategoryNameService{
@Autowired
private CommandGateway commandGateway;
public void ProductCategoryName(ProductCategoryNameDto dto){
AbstractCommand command=new ProductCategoryNameCommand(dto);
commandGateway.sendAndWait(command);
}
}