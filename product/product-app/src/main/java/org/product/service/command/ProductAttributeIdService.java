package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductAttributeIdService{
@Autowired
private CommandGateway commandGateway;
public void ProductAttributeId(ProductAttributeIdDto dto){
AbstractCommand command=new ProductAttributeIdCommand(dto);
commandGateway.sendAndWait(command);
}
}